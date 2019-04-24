.class public Lcom/huawei/health/sns/logic/complain/ComplainRequest$Target;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/logic/complain/ComplainRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Target"
.end annotation


# instance fields
.field public id_:Ljava/lang/String;

.field public name_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 142
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getId_()Ljava/lang/String;
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest$Target;->id_:Ljava/lang/String;

    return-object v0
.end method

.method public getName_()Ljava/lang/String;
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest$Target;->name_:Ljava/lang/String;

    return-object v0
.end method

.method public setId_(Ljava/lang/String;)V
    .locals 0

    .line 152
    iput-object p1, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest$Target;->id_:Ljava/lang/String;

    .line 153
    return-void
.end method

.method public setName_(Ljava/lang/String;)V
    .locals 0

    .line 160
    iput-object p1, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest$Target;->name_:Ljava/lang/String;

    .line 161
    return-void
.end method
