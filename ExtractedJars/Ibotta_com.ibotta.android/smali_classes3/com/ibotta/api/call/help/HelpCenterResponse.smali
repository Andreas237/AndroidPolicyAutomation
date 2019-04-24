.class public Lcom/ibotta/api/call/help/HelpCenterResponse;
.super Lcom/ibotta/api/ApiResponse;
.source "HelpCenterResponse.java"


# instance fields
.field private helpCenterUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Lcom/ibotta/api/ApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getHelpCenterUrl()Ljava/lang/String;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/ibotta/api/call/help/HelpCenterResponse;->helpCenterUrl:Ljava/lang/String;

    return-object v0
.end method

.method public setHelpCenterUrl(Ljava/lang/String;)V
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/ibotta/api/call/help/HelpCenterResponse;->helpCenterUrl:Ljava/lang/String;

    return-void
.end method
