.class public Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfoParam;
.super Ljava/lang/Object;
.source "LaunchInfoParam.java"


# instance fields
.field private launchInfo:Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfo;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getLaunchInfo()Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfo;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfoParam;->launchInfo:Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfo;

    return-object v0
.end method

.method public setLaunchInfo(Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfo;)V
    .locals 0

    .line 15
    iput-object p1, p0, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfoParam;->launchInfo:Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfo;

    return-void
.end method
