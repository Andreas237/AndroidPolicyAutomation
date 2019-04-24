.class public Lo/egz;
.super Landroid/app/Dialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/egz$c;,
        Lo/egz$d;
    }
.end annotation


# static fields
.field private static a:Ljava/lang/String;

.field private static b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 28
    const/4 v0, 0x0

    sput v0, Lo/egz;->b:I

    .line 29
    const/4 v0, 0x0

    sput-object v0, Lo/egz;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 36
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 37
    return-void
.end method

.method static synthetic b(I)I
    .locals 0

    .line 25
    sput p0, Lo/egz;->b:I

    return p0
.end method

.method public static b(Landroid/content/Context;F)I
    .locals 3

    .line 135
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 136
    mul-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method static synthetic c()Ljava/lang/String;
    .locals 1

    .line 25
    sget-object v0, Lo/egz;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 25
    sput-object p0, Lo/egz;->a:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic e()I
    .locals 1

    .line 25
    sget v0, Lo/egz;->b:I

    return v0
.end method
