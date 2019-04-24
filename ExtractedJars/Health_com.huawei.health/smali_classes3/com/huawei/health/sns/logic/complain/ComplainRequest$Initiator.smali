.class public Lcom/huawei/health/sns/logic/complain/ComplainRequest$Initiator;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/logic/complain/ComplainRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Initiator"
.end annotation


# instance fields
.field public id_:J

.field public name_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 120
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getId_()J
    .locals 2

    .line 126
    iget-wide v0, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest$Initiator;->id_:J

    return-wide v0
.end method

.method public getName_()Ljava/lang/String;
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest$Initiator;->name_:Ljava/lang/String;

    return-object v0
.end method

.method public setId_(J)V
    .locals 0

    .line 130
    iput-wide p1, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest$Initiator;->id_:J

    .line 131
    return-void
.end method

.method public setName_(Ljava/lang/String;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/huawei/health/sns/logic/complain/ComplainRequest$Initiator;->name_:Ljava/lang/String;

    .line 139
    return-void
.end method
