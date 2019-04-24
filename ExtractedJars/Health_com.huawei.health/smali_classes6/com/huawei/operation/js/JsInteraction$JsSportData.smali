.class Lcom/huawei/operation/js/JsInteraction$JsSportData;
.super Lcom/huawei/operation/adapter/SportData;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/operation/js/JsInteraction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "JsSportData"
.end annotation


# instance fields
.field private currentTime:Ljava/lang/String;

.field private version:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1160
    invoke-direct {p0}, Lcom/huawei/operation/adapter/SportData;-><init>()V

    return-void
.end method


# virtual methods
.method public getCurrentTime()Ljava/lang/String;
    .locals 1

    .line 1169
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction$JsSportData;->currentTime:Ljava/lang/String;

    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    .line 1177
    iget-object v0, p0, Lcom/huawei/operation/js/JsInteraction$JsSportData;->version:Ljava/lang/String;

    return-object v0
.end method

.method public setCurrentTime(Ljava/lang/String;)V
    .locals 0

    .line 1165
    iput-object p1, p0, Lcom/huawei/operation/js/JsInteraction$JsSportData;->currentTime:Ljava/lang/String;

    .line 1166
    return-void
.end method

.method public setVersion(Ljava/lang/String;)V
    .locals 0

    .line 1173
    iput-object p1, p0, Lcom/huawei/operation/js/JsInteraction$JsSportData;->version:Ljava/lang/String;

    .line 1174
    return-void
.end method
