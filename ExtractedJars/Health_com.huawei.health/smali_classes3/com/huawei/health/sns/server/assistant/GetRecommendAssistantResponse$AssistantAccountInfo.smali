.class public Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse$AssistantAccountInfo;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AssistantAccountInfo"
.end annotation


# instance fields
.field private follow_:I

.field private head_pic_:Ljava/lang/String;

.field private id_:J

.field private introduction_:Ljava/lang/String;

.field private name_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getFollow_()I
    .locals 1

    .line 75
    iget v0, p0, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse$AssistantAccountInfo;->follow_:I

    .line 76
    return v0
.end method

.method public getHead_pic_()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse$AssistantAccountInfo;->head_pic_:Ljava/lang/String;

    .line 54
    return-object v0
.end method

.method public getId_()J
    .locals 2

    .line 97
    iget-wide v0, p0, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse$AssistantAccountInfo;->id_:J

    .line 98
    return-wide v0
.end method

.method public getIntroduction_()Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse$AssistantAccountInfo;->introduction_:Ljava/lang/String;

    .line 65
    return-object v0
.end method

.method public getName_()Ljava/lang/String;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse$AssistantAccountInfo;->name_:Ljava/lang/String;

    .line 87
    return-object v0
.end method

.method public setFollow_(I)V
    .locals 0

    .line 81
    iput p1, p0, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse$AssistantAccountInfo;->follow_:I

    .line 82
    return-void
.end method

.method public setHead_pic_(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse$AssistantAccountInfo;->head_pic_:Ljava/lang/String;

    .line 60
    return-void
.end method

.method public setId_(J)V
    .locals 0

    .line 103
    iput-wide p1, p0, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse$AssistantAccountInfo;->id_:J

    .line 104
    return-void
.end method

.method public setIntroduction_(Ljava/lang/String;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse$AssistantAccountInfo;->introduction_:Ljava/lang/String;

    .line 71
    return-void
.end method

.method public setName_(Ljava/lang/String;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/huawei/health/sns/server/assistant/GetRecommendAssistantResponse$AssistantAccountInfo;->name_:Ljava/lang/String;

    .line 93
    return-void
.end method
