.class public Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog;
.super Landroid/app/Dialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "CustomAuthAlertDialog"


# direct methods
.method private constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 34
    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;ILcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$1;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public static dip2px(Landroid/content/Context;F)I
    .locals 3

    .line 519
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 520
    mul-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method
