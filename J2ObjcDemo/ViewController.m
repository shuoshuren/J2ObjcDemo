//
//  ViewController.m
//  TestTable
//
//  Created by CPX_22 on 2019/3/8.
//  Copyright © 2019 CPX_22. All rights reserved.
//

#import "ViewController.h"

#define random(r, g, b, a) [UIColor colorWithRed:(r)/255.0 green:(g)/255.0 blue:(b)/255.0 alpha:(a)/255.0]

#define randomColor random(arc4random_uniform(256), arc4random_uniform(256), arc4random_uniform(256), arc4random_uniform(256))

@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view, typically from a nib.
    
    double lng = 104.06;
    double lat = 30.67;
    //初始化时传入经纬度
    OJPrayTimeParam *param  = [OJPrayTimeParam getDefaultParamWithDouble:lng withDouble:lat];
    //设置计算方法
    [param setMethodWithInt:OJCalcMethod_Enum_Jafari];
    //设置 AsrJuristic Method
    [param setAsrJuristicWithInt:OJJuristicMethod_Enum_Shafii];
    //设置 高纬度调整方法
    [param setAdjustHighLatsWithInt:OJHighLatAdjustMethod_Enum_AngleBased];
    
    //获取从今天开始的朝拜时间，2 代表获取两天
    JavaUtilArrayList* list = [PrayTimeBaseTools getPrayTimesWithOJPrayTimeParam:param withInt:2];
    for (OJPrayerCalTime* item in list) {
        NSLog(@"%@",item);
    }
    

    OJPrayTimeUtil* util = [[OJPrayTimeUtil alloc] init];
//
//
//
    JavaUtilCalendar* calendar = [JavaUtilCalendar getInstance];
    JavaUtilArrayList *array = [util getPrayerTimesWithJavaUtilCalendar:calendar withDouble:lng withDouble:lat withDouble:8];
//
    for (NSString *obj in array) {
//
//
        NSLog(@"%@",obj);
    }
//
//    NSLog(@"%@",TestHelloWorld_old);
    
    
}



@end
