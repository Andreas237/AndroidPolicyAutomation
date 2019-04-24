.class public Lo/dgp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dgp$b;
    }
.end annotation


# static fields
.field private static c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 9
    const-string v0, "CalculateCaloriesUtils"

    sput-object v0, Lo/dgp;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(DF)D
    .locals 4

    .line 168
    const-wide v0, 0x4004cccccccccccdL    # 2.6

    mul-double/2addr v0, p0

    float-to-double v2, p2

    mul-double/2addr v0, v2

    return-wide v0
.end method

.method public static a(FF)D
    .locals 4

    .line 188
    const/high16 v0, 0x42700000    # 60.0f

    mul-float/2addr v0, p0

    mul-float/2addr v0, p1

    float-to-double v0, v0

    const-wide v2, 0x3fb999999999999aL    # 0.1

    mul-double/2addr v0, v2

    return-wide v0
.end method

.method public static b(DF)D
    .locals 4

    .line 146
    invoke-static {p0, p1, p2}, Lo/dgp;->e(DF)D

    move-result-wide v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    mul-double/2addr v0, v2

    return-wide v0
.end method

.method public static c(IF)D
    .locals 4

    .line 178
    int-to-float v0, p0

    mul-float/2addr v0, p1

    float-to-double v0, v0

    const-wide v2, 0x3fa47ae147ae147bL    # 0.04

    mul-double/2addr v0, v2

    return-wide v0
.end method

.method public static d(FFFI)F
    .locals 6

    .line 275
    const/high16 v0, 0x42700000    # 60.0f

    mul-float/2addr v0, p1

    div-float v0, p0, v0

    float-to-double v0, v0

    const-wide v2, 0x400ccccccccccccdL    # 3.6

    mul-double/2addr v0, v2

    double-to-float v4, v0

    .line 276
    const/high16 v5, 0x40000000    # 2.0f

    .line 277
    packed-switch p3, :pswitch_data_0

    goto :goto_0

    .line 281
    :pswitch_0
    invoke-static {v4}, Lo/dgp$b;->a(F)F

    move-result v5

    .line 282
    goto :goto_0

    .line 284
    :pswitch_1
    invoke-static {v4}, Lo/dgp$b;->b(F)F

    move-result v5

    .line 285
    .line 289
    :goto_0
    float-to-double v0, v5

    const-wide/high16 v2, 0x400c000000000000L    # 3.5

    mul-double/2addr v0, v2

    float-to-double v2, p2

    mul-double/2addr v0, v2

    float-to-double v2, p1

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x4069000000000000L    # 200.0

    div-double/2addr v0, v2

    double-to-float v0, v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static e(DF)D
    .locals 2

    .line 157
    float-to-double v0, p2

    mul-double/2addr v0, p0

    return-wide v0
.end method
