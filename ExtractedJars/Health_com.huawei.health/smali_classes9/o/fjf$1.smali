.class Lo/fjf$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fjf;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/fjf;


# direct methods
.method constructor <init>(Lo/fjf;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lo/fjf$1;->c:Lo/fjf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 78
    new-instance v3, Lcom/huawei/up/model/UserInfomation;

    invoke-direct {v3}, Lcom/huawei/up/model/UserInfomation;-><init>()V

    .line 79
    const/high16 v0, 0x42880000    # 68.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/up/model/UserInfomation;->setWeight(Ljava/lang/Float;)V

    .line 80
    const/16 v0, 0xaf

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/up/model/UserInfomation;->setHeight(Ljava/lang/Integer;)V

    .line 81
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/up/model/UserInfomation;->setGender(Ljava/lang/Integer;)V

    .line 82
    const-string v0, "https://"

    invoke-virtual {v3, v0}, Lcom/huawei/up/model/UserInfomation;->setPortraitUrl(Ljava/lang/String;)V

    .line 83
    const-string v0, "\u5c0f\u660e"

    invoke-virtual {v3, v0}, Lcom/huawei/up/model/UserInfomation;->setName(Ljava/lang/String;)V

    .line 84
    const-string v0, "19950808"

    invoke-virtual {v3, v0}, Lcom/huawei/up/model/UserInfomation;->setBirthday(Ljava/lang/String;)V

    .line 85
    iget-object v0, p0, Lo/fjf$1;->c:Lo/fjf;

    invoke-virtual {v0}, Lo/fjf;->c()Landroid/graphics/Bitmap;

    move-result-object v4

    .line 86
    iget-object v0, p0, Lo/fjf$1;->c:Lo/fjf;

    invoke-static {v0}, Lo/fjf;->a(Lo/fjf;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "1"

    invoke-static {v0, v1, v4}, Lo/cyt;->c(Landroid/content/Context;Ljava/lang/String;Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v5

    .line 87
    invoke-virtual {v3, v5}, Lcom/huawei/up/model/UserInfomation;->setPicPath(Ljava/lang/String;)V

    .line 88
    const-string v0, "SETED"

    invoke-virtual {v3, v0}, Lcom/huawei/up/model/UserInfomation;->setBirthdayStatus(Ljava/lang/String;)V

    .line 89
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/up/model/UserInfomation;->setSetTime(J)V

    .line 90
    iget-object v0, p0, Lo/fjf$1;->c:Lo/fjf;

    invoke-static {v0}, Lo/fjf;->a(Lo/fjf;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    iget-object v1, p0, Lo/fjf$1;->c:Lo/fjf;

    invoke-static {v1}, Lo/fjf;->a(Lo/fjf;)Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lo/fjf$1$5;

    invoke-direct {v2, p0}, Lo/fjf$1$5;-><init>(Lo/fjf$1;)V

    invoke-virtual {v0, v1, v3, v2}, Lo/dnm;->c(Landroid/content/Context;Lcom/huawei/up/model/UserInfomation;Lo/cyx;)V

    .line 96
    return-void
.end method
