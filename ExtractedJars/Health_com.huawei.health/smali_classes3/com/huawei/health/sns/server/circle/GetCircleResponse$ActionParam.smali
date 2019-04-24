.class public Lcom/huawei/health/sns/server/circle/GetCircleResponse$ActionParam;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/circle/GetCircleResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ActionParam"
.end annotation


# instance fields
.field private name_:Ljava/lang/String;

.field private value_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 160
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getName_()Ljava/lang/String;
    .locals 1

    .line 185
    iget-object v0, p0, Lcom/huawei/health/sns/server/circle/GetCircleResponse$ActionParam;->name_:Ljava/lang/String;

    .line 186
    return-object v0
.end method

.method public getValue_()Ljava/lang/String;
    .locals 1

    .line 191
    iget-object v0, p0, Lcom/huawei/health/sns/server/circle/GetCircleResponse$ActionParam;->value_:Ljava/lang/String;

    .line 192
    return-object v0
.end method

.method public setName_(Ljava/lang/String;)V
    .locals 0

    .line 163
    iput-object p1, p0, Lcom/huawei/health/sns/server/circle/GetCircleResponse$ActionParam;->name_:Ljava/lang/String;

    .line 164
    return-void
.end method

.method public setValue_(Ljava/lang/String;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lcom/huawei/health/sns/server/circle/GetCircleResponse$ActionParam;->value_:Ljava/lang/String;

    .line 173
    return-void
.end method
