.class public interface abstract Lcom/ibotta/android/aop/tracking/newrelic/timing/NewRelicTimingAdvice;
.super Ljava/lang/Object;
.source "NewRelicTimingAdvice.java"


# static fields
.field public static final ATTR_CACHED_OBJECT_NAME:Ljava/lang/String; = "cached_object_name"

.field public static final ATTR_RETAILER_ID:Ljava/lang/String; = "retailer_id"

.field public static final ATTR_TIME:Ljava/lang/String; = "time"

.field public static final EVENT_NAME_TIME_TO_FIRST_CONTENT:Ljava/lang/String; = "time_to_first_content"

.field public static final EVENT_NAME_TIME_TO_LOAD_IGC_BARCODE:Ljava/lang/String; = "time_to_load_igc_barcode"

.field public static final EVENT_TYPE_TIMING:Ljava/lang/String; = "timing"


# virtual methods
.method public abstract startClock(Lorg/aspectj/lang/JoinPoint;)V
.end method

.method public abstract stopClock(Lorg/aspectj/lang/JoinPoint;)V
.end method
