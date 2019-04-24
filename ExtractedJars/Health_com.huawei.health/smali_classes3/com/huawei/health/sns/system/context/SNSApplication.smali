.class public Lcom/huawei/health/sns/system/context/SNSApplication;
.super Landroid/app/Application;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 1

    .line 20
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 22
    invoke-static {}, Lo/bch;->a()Lo/bch;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/bch;->b(Landroid/content/Context;)V

    .line 23
    return-void
.end method
