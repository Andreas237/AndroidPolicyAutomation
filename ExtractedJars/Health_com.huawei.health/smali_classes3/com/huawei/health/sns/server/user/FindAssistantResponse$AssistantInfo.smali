.class public Lcom/huawei/health/sns/server/user/FindAssistantResponse$AssistantInfo;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/user/FindAssistantResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AssistantInfo"
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

    .line 48
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getFollow_()I
    .locals 1

    .line 99
    iget v0, p0, Lcom/huawei/health/sns/server/user/FindAssistantResponse$AssistantInfo;->follow_:I

    .line 100
    return v0
.end method

.method public getHead_pic_()Ljava/lang/String;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/FindAssistantResponse$AssistantInfo;->head_pic_:Ljava/lang/String;

    .line 78
    return-object v0
.end method

.method public getId_()J
    .locals 2

    .line 121
    iget-wide v0, p0, Lcom/huawei/health/sns/server/user/FindAssistantResponse$AssistantInfo;->id_:J

    .line 122
    return-wide v0
.end method

.method public getIntroduction_()Ljava/lang/String;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/FindAssistantResponse$AssistantInfo;->introduction_:Ljava/lang/String;

    .line 89
    return-object v0
.end method

.method public getName_()Ljava/lang/String;
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/FindAssistantResponse$AssistantInfo;->name_:Ljava/lang/String;

    .line 111
    return-object v0
.end method

.method public setFollow_(I)V
    .locals 0

    .line 105
    iput p1, p0, Lcom/huawei/health/sns/server/user/FindAssistantResponse$AssistantInfo;->follow_:I

    .line 106
    return-void
.end method

.method public setHead_pic_(Ljava/lang/String;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/FindAssistantResponse$AssistantInfo;->head_pic_:Ljava/lang/String;

    .line 84
    return-void
.end method

.method public setId_(J)V
    .locals 0

    .line 127
    iput-wide p1, p0, Lcom/huawei/health/sns/server/user/FindAssistantResponse$AssistantInfo;->id_:J

    .line 128
    return-void
.end method

.method public setIntroduction_(Ljava/lang/String;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/FindAssistantResponse$AssistantInfo;->introduction_:Ljava/lang/String;

    .line 95
    return-void
.end method

.method public setName_(Ljava/lang/String;)V
    .locals 0

    .line 116
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/FindAssistantResponse$AssistantInfo;->name_:Ljava/lang/String;

    .line 117
    return-void
.end method
