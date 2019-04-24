.class public Lcom/huawei/openalliance/ad/db/bean/UserCloseRecord;
.super Lcom/huawei/openalliance/ad/db/bean/RecordBean;


# static fields
.field private static final TAG:Ljava/lang/String; = "UserCloseRecord"

.field public static final TIME_STAMP:Ljava/lang/String; = "timeStamp"


# instance fields
.field private timeStamp_:J

.field private time_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/db/bean/RecordBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getTimeStamp_()J
    .locals 2

    iget-wide v0, p0, Lcom/huawei/openalliance/ad/db/bean/UserCloseRecord;->timeStamp_:J

    return-wide v0
.end method

.method public getTime_()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/UserCloseRecord;->time_:Ljava/lang/String;

    return-object v0
.end method

.method public setTimeStamp_(J)V
    .locals 0

    iput-wide p1, p0, Lcom/huawei/openalliance/ad/db/bean/UserCloseRecord;->timeStamp_:J

    return-void
.end method

.method public setTime_(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/db/bean/UserCloseRecord;->time_:Ljava/lang/String;

    return-void
.end method
