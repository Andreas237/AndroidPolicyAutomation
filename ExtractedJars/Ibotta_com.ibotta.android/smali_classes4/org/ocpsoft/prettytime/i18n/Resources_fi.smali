.class public Lorg/ocpsoft/prettytime/i18n/Resources_fi;
.super Ljava/util/ListResourceBundle;
.source "Resources_fi.java"

# interfaces
.implements Lorg/ocpsoft/prettytime/impl/TimeFormatProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;
    }
.end annotation


# static fields
.field private static CONTENTS:[[Ljava/lang/Object;


# instance fields
.field private volatile formatMap:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Lorg/ocpsoft/prettytime/TimeUnit;",
            "Lorg/ocpsoft/prettytime/TimeFormat;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/16 v0, 0x54

    .line 17
    new-array v0, v0, [[Ljava/lang/Object;

    const/4 v1, 0x2

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "JustNowPattern"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "%u"

    const/4 v5, 0x1

    aput-object v3, v2, v5

    aput-object v2, v0, v4

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "JustNowPastSingularName"

    aput-object v3, v2, v4

    const-string v3, "hetki"

    aput-object v3, v2, v5

    aput-object v2, v0, v5

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "JustNowFutureSingularName"

    aput-object v3, v2, v4

    const-string v3, "hetken"

    aput-object v3, v2, v5

    aput-object v2, v0, v1

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "JustNowPastSuffix"

    aput-object v3, v2, v4

    const-string v3, "sitten"

    aput-object v3, v2, v5

    const/4 v3, 0x3

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "JustNowFutureSuffix"

    aput-object v3, v2, v4

    const-string v3, "p\u00e4\u00e4st\u00e4"

    aput-object v3, v2, v5

    const/4 v3, 0x4

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "MillisecondPattern"

    aput-object v3, v2, v4

    const-string v3, "%u"

    aput-object v3, v2, v5

    const/4 v3, 0x5

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "MillisecondPluralPattern"

    aput-object v3, v2, v4

    const-string v3, "%n %u"

    aput-object v3, v2, v5

    const/4 v3, 0x6

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "MillisecondPastSingularName"

    aput-object v3, v2, v4

    const-string v3, "millisekunti"

    aput-object v3, v2, v5

    const/4 v3, 0x7

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "MillisecondPastPluralName"

    aput-object v3, v2, v4

    const-string v3, "millisekuntia"

    aput-object v3, v2, v5

    const/16 v3, 0x8

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "MillisecondFutureSingularName"

    aput-object v3, v2, v4

    const-string v3, "millisekunnin"

    aput-object v3, v2, v5

    const/16 v3, 0x9

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "MillisecondPastSuffix"

    aput-object v3, v2, v4

    const-string v3, "sitten"

    aput-object v3, v2, v5

    const/16 v3, 0xa

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "MillisecondFutureSuffix"

    aput-object v3, v2, v4

    const-string v3, "p\u00e4\u00e4st\u00e4"

    aput-object v3, v2, v5

    const/16 v3, 0xb

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "SecondPattern"

    aput-object v3, v2, v4

    const-string v3, "%u"

    aput-object v3, v2, v5

    const/16 v3, 0xc

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "SecondPluralPattern"

    aput-object v3, v2, v4

    const-string v3, "%n %u"

    aput-object v3, v2, v5

    const/16 v3, 0xd

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "SecondPastSingularName"

    aput-object v3, v2, v4

    const-string v3, "sekunti"

    aput-object v3, v2, v5

    const/16 v3, 0xe

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "SecondPastPluralName"

    aput-object v3, v2, v4

    const-string v3, "sekuntia"

    aput-object v3, v2, v5

    const/16 v3, 0xf

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "SecondFutureSingularName"

    aput-object v3, v2, v4

    const-string v3, "sekunnin"

    aput-object v3, v2, v5

    const/16 v3, 0x10

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "SecondPastSuffix"

    aput-object v3, v2, v4

    const-string v3, "sitten"

    aput-object v3, v2, v5

    const/16 v3, 0x11

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "SecondFutureSuffix"

    aput-object v3, v2, v4

    const-string v3, "p\u00e4\u00e4st\u00e4"

    aput-object v3, v2, v5

    const/16 v3, 0x12

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "MinutePattern"

    aput-object v3, v2, v4

    const-string v3, "%u"

    aput-object v3, v2, v5

    const/16 v3, 0x13

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "MinutePluralPattern"

    aput-object v3, v2, v4

    const-string v3, "%n %u"

    aput-object v3, v2, v5

    const/16 v3, 0x14

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "MinutePastSingularName"

    aput-object v3, v2, v4

    const-string v3, "minuutti"

    aput-object v3, v2, v5

    const/16 v3, 0x15

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "MinutePastPluralName"

    aput-object v3, v2, v4

    const-string v3, "minuuttia"

    aput-object v3, v2, v5

    const/16 v3, 0x16

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "MinuteFutureSingularName"

    aput-object v3, v2, v4

    const-string v3, "minuutin"

    aput-object v3, v2, v5

    const/16 v3, 0x17

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "MinutePastSuffix"

    aput-object v3, v2, v4

    const-string v3, "sitten"

    aput-object v3, v2, v5

    const/16 v3, 0x18

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "MinuteFutureSuffix"

    aput-object v3, v2, v4

    const-string v3, "p\u00e4\u00e4st\u00e4"

    aput-object v3, v2, v5

    const/16 v3, 0x19

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "HourPattern"

    aput-object v3, v2, v4

    const-string v3, "%u"

    aput-object v3, v2, v5

    const/16 v3, 0x1a

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "HourPluralPattern"

    aput-object v3, v2, v4

    const-string v3, "%n %u"

    aput-object v3, v2, v5

    const/16 v3, 0x1b

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "HourPastSingularName"

    aput-object v3, v2, v4

    const-string v3, "tunti"

    aput-object v3, v2, v5

    const/16 v3, 0x1c

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "HourPastPluralName"

    aput-object v3, v2, v4

    const-string v3, "tuntia"

    aput-object v3, v2, v5

    const/16 v3, 0x1d

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "HourFutureSingularName"

    aput-object v3, v2, v4

    const-string v3, "tunnin"

    aput-object v3, v2, v5

    const/16 v3, 0x1e

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "HourPastSuffix"

    aput-object v3, v2, v4

    const-string v3, "sitten"

    aput-object v3, v2, v5

    const/16 v3, 0x1f

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "HourFutureSuffix"

    aput-object v3, v2, v4

    const-string v3, "p\u00e4\u00e4st\u00e4"

    aput-object v3, v2, v5

    const/16 v3, 0x20

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "DayPattern"

    aput-object v3, v2, v4

    const-string v3, "%u"

    aput-object v3, v2, v5

    const/16 v3, 0x21

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "DayPluralPattern"

    aput-object v3, v2, v4

    const-string v3, "%n %u"

    aput-object v3, v2, v5

    const/16 v3, 0x22

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "DayPastSingularName"

    aput-object v3, v2, v4

    const-string v3, "eilen"

    aput-object v3, v2, v5

    const/16 v3, 0x23

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "DayPastPluralName"

    aput-object v3, v2, v4

    const-string v3, "p\u00e4iv\u00e4\u00e4"

    aput-object v3, v2, v5

    const/16 v3, 0x24

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "DayFutureSingularName"

    aput-object v3, v2, v4

    const-string v3, "huomenna"

    aput-object v3, v2, v5

    const/16 v3, 0x25

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "DayFuturePluralName"

    aput-object v3, v2, v4

    const-string v3, "p\u00e4iv\u00e4n"

    aput-object v3, v2, v5

    const/16 v3, 0x26

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "DayPastSuffix"

    aput-object v3, v2, v4

    const-string v3, "sitten"

    aput-object v3, v2, v5

    const/16 v3, 0x27

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "DayFutureSuffix"

    aput-object v3, v2, v4

    const-string v3, "p\u00e4\u00e4st\u00e4"

    aput-object v3, v2, v5

    const/16 v3, 0x28

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "WeekPattern"

    aput-object v3, v2, v4

    const-string v3, "%u"

    aput-object v3, v2, v5

    const/16 v3, 0x29

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "WeekPluralPattern"

    aput-object v3, v2, v4

    const-string v3, "%n %u"

    aput-object v3, v2, v5

    const/16 v3, 0x2a

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "WeekPastSingularName"

    aput-object v3, v2, v4

    const-string v3, "viikko"

    aput-object v3, v2, v5

    const/16 v3, 0x2b

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "WeekPastPluralName"

    aput-object v3, v2, v4

    const-string v3, "viikkoa"

    aput-object v3, v2, v5

    const/16 v3, 0x2c

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "WeekFutureSingularName"

    aput-object v3, v2, v4

    const-string v3, "viikon"

    aput-object v3, v2, v5

    const/16 v3, 0x2d

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "WeekFuturePluralName"

    aput-object v3, v2, v4

    const-string v3, "viikon"

    aput-object v3, v2, v5

    const/16 v3, 0x2e

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "WeekPastSuffix"

    aput-object v3, v2, v4

    const-string v3, "sitten"

    aput-object v3, v2, v5

    const/16 v3, 0x2f

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "WeekFutureSuffix"

    aput-object v3, v2, v4

    const-string v3, "p\u00e4\u00e4st\u00e4"

    aput-object v3, v2, v5

    const/16 v3, 0x30

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "MonthPattern"

    aput-object v3, v2, v4

    const-string v3, "%u"

    aput-object v3, v2, v5

    const/16 v3, 0x31

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "MonthPluralPattern"

    aput-object v3, v2, v4

    const-string v3, "%n %u"

    aput-object v3, v2, v5

    const/16 v3, 0x32

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "MonthPastSingularName"

    aput-object v3, v2, v4

    const-string v3, "kuukausi"

    aput-object v3, v2, v5

    const/16 v3, 0x33

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "MonthPastPluralName"

    aput-object v3, v2, v4

    const-string v3, "kuukautta"

    aput-object v3, v2, v5

    const/16 v3, 0x34

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "MonthFutureSingularName"

    aput-object v3, v2, v4

    const-string v3, "kuukauden"

    aput-object v3, v2, v5

    const/16 v3, 0x35

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "MonthPastSuffix"

    aput-object v3, v2, v4

    const-string v3, "sitten"

    aput-object v3, v2, v5

    const/16 v3, 0x36

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "MonthFutureSuffix"

    aput-object v3, v2, v4

    const-string v3, "p\u00e4\u00e4st\u00e4"

    aput-object v3, v2, v5

    const/16 v3, 0x37

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "YearPattern"

    aput-object v3, v2, v4

    const-string v3, "%u"

    aput-object v3, v2, v5

    const/16 v3, 0x38

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "YearPluralPattern"

    aput-object v3, v2, v4

    const-string v3, "%n %u"

    aput-object v3, v2, v5

    const/16 v3, 0x39

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "YearPastSingularName"

    aput-object v3, v2, v4

    const-string v3, "vuosi"

    aput-object v3, v2, v5

    const/16 v3, 0x3a

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "YearPastPluralName"

    aput-object v3, v2, v4

    const-string v3, "vuotta"

    aput-object v3, v2, v5

    const/16 v3, 0x3b

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "YearFutureSingularName"

    aput-object v3, v2, v4

    const-string v3, "vuoden"

    aput-object v3, v2, v5

    const/16 v3, 0x3c

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "YearPastSuffix"

    aput-object v3, v2, v4

    const-string v3, "sitten"

    aput-object v3, v2, v5

    const/16 v3, 0x3d

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "YearFutureSuffix"

    aput-object v3, v2, v4

    const-string v3, "p\u00e4\u00e4st\u00e4"

    aput-object v3, v2, v5

    const/16 v3, 0x3e

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "DecadePattern"

    aput-object v3, v2, v4

    const-string v3, "%u"

    aput-object v3, v2, v5

    const/16 v3, 0x3f

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "DecadePluralPattern"

    aput-object v3, v2, v4

    const-string v3, "%n %u"

    aput-object v3, v2, v5

    const/16 v3, 0x40

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "DecadePastSingularName"

    aput-object v3, v2, v4

    const-string v3, "vuosikymmen"

    aput-object v3, v2, v5

    const/16 v3, 0x41

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "DecadePastPluralName"

    aput-object v3, v2, v4

    const-string v3, "vuosikymment\u00e4"

    aput-object v3, v2, v5

    const/16 v3, 0x42

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "DecadeFutureSingularName"

    aput-object v3, v2, v4

    const-string v3, "vuosikymmenen"

    aput-object v3, v2, v5

    const/16 v3, 0x43

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "DecadePastSuffix"

    aput-object v3, v2, v4

    const-string v3, "sitten"

    aput-object v3, v2, v5

    const/16 v3, 0x44

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "DecadeFutureSuffix"

    aput-object v3, v2, v4

    const-string v3, "p\u00e4\u00e4st\u00e4"

    aput-object v3, v2, v5

    const/16 v3, 0x45

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "CenturyPattern"

    aput-object v3, v2, v4

    const-string v3, "%u"

    aput-object v3, v2, v5

    const/16 v3, 0x46

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "CenturyPluralPattern"

    aput-object v3, v2, v4

    const-string v3, "%n %u"

    aput-object v3, v2, v5

    const/16 v3, 0x47

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "CenturyPastSingularName"

    aput-object v3, v2, v4

    const-string v3, "vuosisata"

    aput-object v3, v2, v5

    const/16 v3, 0x48

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "CenturyPastPluralName"

    aput-object v3, v2, v4

    const-string v3, "vuosisataa"

    aput-object v3, v2, v5

    const/16 v3, 0x49

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "CenturyFutureSingularName"

    aput-object v3, v2, v4

    const-string v3, "vuosisadan"

    aput-object v3, v2, v5

    const/16 v3, 0x4a

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "CenturyPastSuffix"

    aput-object v3, v2, v4

    const-string v3, "sitten"

    aput-object v3, v2, v5

    const/16 v3, 0x4b

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "CenturyFutureSuffix"

    aput-object v3, v2, v4

    const-string v3, "p\u00e4\u00e4st\u00e4"

    aput-object v3, v2, v5

    const/16 v3, 0x4c

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "MillenniumPattern"

    aput-object v3, v2, v4

    const-string v3, "%u"

    aput-object v3, v2, v5

    const/16 v3, 0x4d

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "MillenniumPluralPattern"

    aput-object v3, v2, v4

    const-string v3, "%n %u"

    aput-object v3, v2, v5

    const/16 v3, 0x4e

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "MillenniumPastSingularName"

    aput-object v3, v2, v4

    const-string v3, "vuosituhat"

    aput-object v3, v2, v5

    const/16 v3, 0x4f

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "MillenniumPastPluralName"

    aput-object v3, v2, v4

    const-string v3, "vuosituhatta"

    aput-object v3, v2, v5

    const/16 v3, 0x50

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "MillenniumFutureSingularName"

    aput-object v3, v2, v4

    const-string v3, "vuosituhannen"

    aput-object v3, v2, v5

    const/16 v3, 0x51

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "MillenniumPastSuffix"

    aput-object v3, v2, v4

    const-string v3, "sitten"

    aput-object v3, v2, v5

    const/16 v3, 0x52

    aput-object v2, v0, v3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MillenniumFutureSuffix"

    aput-object v2, v1, v4

    const-string v2, "p\u00e4\u00e4st\u00e4"

    aput-object v2, v1, v5

    const/16 v2, 0x53

    aput-object v1, v0, v2

    sput-object v0, Lorg/ocpsoft/prettytime/i18n/Resources_fi;->CONTENTS:[[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 105
    invoke-direct {p0}, Ljava/util/ListResourceBundle;-><init>()V

    .line 103
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi;->formatMap:Ljava/util/concurrent/ConcurrentMap;

    return-void
.end method


# virtual methods
.method protected getContents()[[Ljava/lang/Object;
    .locals 1

    .line 118
    sget-object v0, Lorg/ocpsoft/prettytime/i18n/Resources_fi;->CONTENTS:[[Ljava/lang/Object;

    return-object v0
.end method

.method public getFormatFor(Lorg/ocpsoft/prettytime/TimeUnit;)Lorg/ocpsoft/prettytime/TimeFormat;
    .locals 2

    .line 110
    iget-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi;->formatMap:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 111
    iget-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi;->formatMap:Ljava/util/concurrent/ConcurrentMap;

    new-instance v1, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;

    invoke-direct {v1, p0, p1}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;-><init>(Ljava/util/ResourceBundle;Lorg/ocpsoft/prettytime/TimeUnit;)V

    invoke-interface {v0, p1, v1}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    :cond_0
    iget-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi;->formatMap:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/ocpsoft/prettytime/TimeFormat;

    return-object p1
.end method
