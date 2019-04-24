.class public final enum Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhuawei/android/hwcolorpicker/HwColorPicker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ResultType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

.field public static final enum Domain:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

.field public static final enum DomainDark:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

.field public static final enum DomainDarkB:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

.field public static final enum DomainDarkC:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

.field public static final enum DomainLight:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

.field public static final enum DomainLightB:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

.field public static final enum DomainLightC:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

.field public static final enum MergedNum1:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

.field public static final enum MergedNum2:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

.field public static final enum MergedNum3:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

.field public static final enum MergedRgb1:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

.field public static final enum MergedRgb2:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

.field public static final enum MergedRgb3:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

.field public static final enum Music_Domain:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

.field public static final enum Music_Light:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

.field public static final enum Music_Title:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

.field public static final enum Music_Widget:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

.field public static final enum OriginNum1:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

.field public static final enum OriginNum2:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

.field public static final enum OriginNum3:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

.field public static final enum OriginRgb1:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

.field public static final enum OriginRgb2:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

.field public static final enum OriginRgb3:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

.field public static final enum Second:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

.field public static final enum SecondDark:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

.field public static final enum SecondLight:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

.field public static final enum Shadow:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

.field public static final enum Widget:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;


# instance fields
.field private clientType:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

.field private flag:I

.field private index:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 428
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const-string v1, "Domain"

    sget-object v2, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Default:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v3, v2, v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;-><init>(Ljava/lang/String;ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;I)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->Domain:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    .line 434
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const-string v1, "DomainDark"

    sget-object v2, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Default:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-direct {v0, v1, v3, v2, v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;-><init>(Ljava/lang/String;ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;I)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->DomainDark:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    .line 440
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const-string v1, "DomainDarkB"

    sget-object v2, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Default:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    const/4 v3, 0x2

    const/4 v4, 0x2

    invoke-direct {v0, v1, v3, v2, v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;-><init>(Ljava/lang/String;ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;I)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->DomainDarkB:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    .line 446
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const-string v1, "DomainDarkC"

    sget-object v2, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Default:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    const/4 v3, 0x3

    const/4 v4, 0x3

    invoke-direct {v0, v1, v3, v2, v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;-><init>(Ljava/lang/String;ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;I)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->DomainDarkC:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    .line 452
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const-string v1, "DomainLight"

    sget-object v2, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Default:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    const/4 v3, 0x4

    const/4 v4, 0x4

    invoke-direct {v0, v1, v3, v2, v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;-><init>(Ljava/lang/String;ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;I)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->DomainLight:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    .line 458
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const-string v1, "DomainLightB"

    sget-object v2, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Default:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    const/4 v3, 0x5

    const/4 v4, 0x5

    invoke-direct {v0, v1, v3, v2, v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;-><init>(Ljava/lang/String;ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;I)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->DomainLightB:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    .line 464
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const-string v1, "DomainLightC"

    sget-object v2, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Default:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    const/4 v3, 0x6

    const/4 v4, 0x6

    invoke-direct {v0, v1, v3, v2, v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;-><init>(Ljava/lang/String;ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;I)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->DomainLightC:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    .line 470
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const-string v1, "Second"

    sget-object v2, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Default:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    const/4 v3, 0x7

    const/4 v4, 0x7

    invoke-direct {v0, v1, v3, v2, v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;-><init>(Ljava/lang/String;ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;I)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->Second:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    .line 476
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const-string v1, "SecondDark"

    sget-object v2, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Default:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    const/16 v3, 0x8

    const/16 v4, 0x8

    invoke-direct {v0, v1, v3, v2, v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;-><init>(Ljava/lang/String;ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;I)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->SecondDark:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    .line 482
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const-string v1, "SecondLight"

    sget-object v2, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Default:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    const/16 v3, 0x9

    const/16 v4, 0x9

    invoke-direct {v0, v1, v3, v2, v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;-><init>(Ljava/lang/String;ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;I)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->SecondLight:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    .line 488
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const-string v1, "Widget"

    sget-object v2, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Default:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    const/16 v3, 0xa

    const/16 v4, 0xa

    invoke-direct {v0, v1, v3, v2, v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;-><init>(Ljava/lang/String;ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;I)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->Widget:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    .line 494
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const-string v1, "Shadow"

    sget-object v2, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Default:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    const/16 v3, 0xb

    const/16 v4, 0xb

    invoke-direct {v0, v1, v3, v2, v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;-><init>(Ljava/lang/String;ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;I)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->Shadow:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    .line 501
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const-string v1, "OriginRgb1"

    sget-object v2, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Extend:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    const/16 v3, 0xc

    const/4 v4, 0x0

    invoke-direct {v0, v1, v3, v2, v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;-><init>(Ljava/lang/String;ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;I)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->OriginRgb1:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    .line 507
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const-string v1, "OriginRgb2"

    sget-object v2, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Extend:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    const/16 v3, 0xd

    const/4 v4, 0x1

    invoke-direct {v0, v1, v3, v2, v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;-><init>(Ljava/lang/String;ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;I)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->OriginRgb2:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    .line 513
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const-string v1, "OriginRgb3"

    sget-object v2, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Extend:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    const/16 v3, 0xe

    const/4 v4, 0x2

    invoke-direct {v0, v1, v3, v2, v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;-><init>(Ljava/lang/String;ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;I)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->OriginRgb3:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    .line 519
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const-string v1, "OriginNum1"

    sget-object v2, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Extend:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    const/16 v3, 0xf

    const/4 v4, 0x3

    invoke-direct {v0, v1, v3, v2, v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;-><init>(Ljava/lang/String;ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;I)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->OriginNum1:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    .line 525
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const-string v1, "OriginNum2"

    sget-object v2, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Extend:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    const/16 v3, 0x10

    const/4 v4, 0x4

    invoke-direct {v0, v1, v3, v2, v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;-><init>(Ljava/lang/String;ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;I)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->OriginNum2:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    .line 531
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const-string v1, "OriginNum3"

    sget-object v2, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Extend:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    const/16 v3, 0x11

    const/4 v4, 0x5

    invoke-direct {v0, v1, v3, v2, v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;-><init>(Ljava/lang/String;ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;I)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->OriginNum3:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    .line 537
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const-string v1, "MergedRgb1"

    sget-object v2, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Extend:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    const/16 v3, 0x12

    const/4 v4, 0x6

    invoke-direct {v0, v1, v3, v2, v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;-><init>(Ljava/lang/String;ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;I)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->MergedRgb1:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    .line 543
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const-string v1, "MergedRgb2"

    sget-object v2, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Extend:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    const/16 v3, 0x13

    const/4 v4, 0x7

    invoke-direct {v0, v1, v3, v2, v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;-><init>(Ljava/lang/String;ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;I)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->MergedRgb2:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    .line 549
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const-string v1, "MergedRgb3"

    sget-object v2, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Extend:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    const/16 v3, 0x14

    const/16 v4, 0x8

    invoke-direct {v0, v1, v3, v2, v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;-><init>(Ljava/lang/String;ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;I)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->MergedRgb3:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    .line 555
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const-string v1, "MergedNum1"

    sget-object v2, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Extend:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    const/16 v3, 0x15

    const/16 v4, 0x9

    invoke-direct {v0, v1, v3, v2, v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;-><init>(Ljava/lang/String;ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;I)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->MergedNum1:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    .line 561
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const-string v1, "MergedNum2"

    sget-object v2, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Extend:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    const/16 v3, 0x16

    const/16 v4, 0xa

    invoke-direct {v0, v1, v3, v2, v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;-><init>(Ljava/lang/String;ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;I)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->MergedNum2:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    .line 567
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const-string v1, "MergedNum3"

    sget-object v2, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Extend:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    const/16 v3, 0x17

    const/16 v4, 0xb

    invoke-direct {v0, v1, v3, v2, v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;-><init>(Ljava/lang/String;ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;I)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->MergedNum3:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    .line 574
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const-string v1, "Music_Domain"

    sget-object v2, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Music:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    const/16 v3, 0x18

    const/4 v4, 0x0

    invoke-direct {v0, v1, v3, v2, v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;-><init>(Ljava/lang/String;ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;I)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->Music_Domain:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    .line 580
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const-string v1, "Music_Light"

    sget-object v2, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Music:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    const/16 v3, 0x19

    const/4 v4, 0x1

    invoke-direct {v0, v1, v3, v2, v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;-><init>(Ljava/lang/String;ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;I)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->Music_Light:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    .line 586
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const-string v1, "Music_Widget"

    sget-object v2, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Music:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    const/16 v3, 0x1a

    const/4 v4, 0x2

    invoke-direct {v0, v1, v3, v2, v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;-><init>(Ljava/lang/String;ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;I)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->Music_Widget:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    .line 592
    new-instance v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const-string v1, "Music_Title"

    sget-object v2, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->Music:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    const/16 v3, 0x1b

    const/4 v4, 0x3

    invoke-direct {v0, v1, v3, v2, v4}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;-><init>(Ljava/lang/String;ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;I)V

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->Music_Title:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    .line 422
    const/16 v0, 0x1c

    new-array v0, v0, [Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->Domain:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->DomainDark:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->DomainDarkB:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->DomainDarkC:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->DomainLight:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->DomainLightB:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->DomainLightC:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->Second:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->SecondDark:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->SecondLight:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->Widget:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->Shadow:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->OriginRgb1:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->OriginRgb2:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->OriginRgb3:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->OriginNum1:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->OriginNum2:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->OriginNum3:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->MergedRgb1:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->MergedRgb2:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->MergedRgb3:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const/16 v2, 0x14

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->MergedNum1:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const/16 v2, 0x15

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->MergedNum2:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const/16 v2, 0x16

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->MergedNum3:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const/16 v2, 0x17

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->Music_Domain:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const/16 v2, 0x18

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->Music_Light:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const/16 v2, 0x19

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->Music_Widget:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    sget-object v1, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->Music_Title:Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    sput-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->$VALUES:[Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILhuawei/android/hwcolorpicker/HwColorPicker$ClientType;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;I)V"
        }
    .end annotation

    .line 598
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 599
    iput-object p3, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->clientType:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    .line 600
    const v0, 0xffff

    and-int/2addr v0, p4

    iput v0, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->index:I

    .line 601
    invoke-static {p3}, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->access$200(Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;)I

    move-result v0

    shl-int/lit8 v0, v0, 0x18

    const/high16 v1, -0x1000000

    and-int/2addr v0, v1

    const v1, 0xffff

    and-int/2addr v1, p4

    or-int/2addr v0, v1

    iput v0, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->flag:I

    .line 602
    return-void
.end method

.method static synthetic access$300(Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;)I
    .locals 1

    .line 422
    iget v0, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->index:I

    return v0
.end method

.method public static getRequestedColorNum(I)I
    .locals 5

    .line 605
    invoke-static {}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->values()[Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    move-result-object v1

    .line 606
    const/4 v2, 0x0

    .line 607
    array-length v3, v1

    .line 608
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    .line 609
    aget-object v0, v1, v4

    iget-object v0, v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->clientType:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    invoke-static {v0}, Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;->access$200(Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;)I

    move-result v0

    if-ne p0, v0, :cond_0

    .line 610
    add-int/lit8 v2, v2, 0x1

    .line 608
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 613
    :cond_1
    return v2
.end method

.method public static valueOf(Ljava/lang/String;)Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;
    .locals 1

    .line 422
    const-class v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    return-object v0
.end method

.method public static values()[Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;
    .locals 1

    .line 422
    sget-object v0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->$VALUES:[Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    invoke-virtual {v0}, [Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 5

    .line 618
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->clientType:Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->index:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "0x%08x"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lhuawei/android/hwcolorpicker/HwColorPicker$ResultType;->flag:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
