.class public Lcom/huawei/openalliance/ad/beans/metadata/ReduceDisturbRule;
.super Lcom/huawei/openalliance/ad/beans/base/RspBean;


# static fields
.field private static final TAG:Ljava/lang/String; = "ReduceDisturbRule"


# instance fields
.field private ruleList__:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/openalliance/ad/beans/metadata/Rule;>;"
        }
    .end annotation
.end field

.field private timeStamp__:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/beans/base/RspBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getRuleList__()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/openalliance/ad/beans/metadata/Rule;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/ReduceDisturbRule;->ruleList__:Ljava/util/List;

    return-object v0
.end method

.method public getTimeStamp__()J
    .locals 2

    iget-wide v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/ReduceDisturbRule;->timeStamp__:J

    return-wide v0
.end method

.method public setRuleList__(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/openalliance/ad/beans/metadata/Rule;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/ReduceDisturbRule;->ruleList__:Ljava/util/List;

    return-void
.end method

.method public setTimeStamp__(J)V
    .locals 0

    iput-wide p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/ReduceDisturbRule;->timeStamp__:J

    return-void
.end method
