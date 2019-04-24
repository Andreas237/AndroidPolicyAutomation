.class Lcom/shopkick/app/campaigns/MessageHistoryRecord;
.super Ljava/lang/Object;
.source "MessageHistoryRecord.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;
    }
.end annotation


# instance fields
.field private final campaignId:Ljava/lang/String;

.field private final campaignType:I

.field private final chainId:Ljava/lang/String;

.field private final departmentId:Ljava/lang/String;

.field private final locationId:Ljava/lang/String;

.field private final messageType:Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;

.field private final timestampMilliseconds:J


# direct methods
.method constructor <init>(JLcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p3, :cond_4

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_3

    .line 65
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x64

    add-long/2addr v0, v2

    cmp-long v0, p1, v0

    if-gtz v0, :cond_3

    .line 69
    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 72
    invoke-static {p6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 75
    invoke-static {p7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 80
    iput-wide p1, p0, Lcom/shopkick/app/campaigns/MessageHistoryRecord;->timestampMilliseconds:J

    .line 81
    iput-object p3, p0, Lcom/shopkick/app/campaigns/MessageHistoryRecord;->messageType:Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;

    .line 82
    iput p4, p0, Lcom/shopkick/app/campaigns/MessageHistoryRecord;->campaignType:I

    .line 83
    iput-object p5, p0, Lcom/shopkick/app/campaigns/MessageHistoryRecord;->campaignId:Ljava/lang/String;

    .line 84
    iput-object p6, p0, Lcom/shopkick/app/campaigns/MessageHistoryRecord;->chainId:Ljava/lang/String;

    .line 85
    iput-object p7, p0, Lcom/shopkick/app/campaigns/MessageHistoryRecord;->locationId:Ljava/lang/String;

    .line 86
    iput-object p8, p0, Lcom/shopkick/app/campaigns/MessageHistoryRecord;->departmentId:Ljava/lang/String;

    return-void

    .line 76
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'locationId\' cannot be null or empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 73
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'chainId\' cannot be null or empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 70
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'campaignId\' cannot be null or empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 66
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'timestampMilliseconds\' cannot be less than or equal to zero or in the future"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 63
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'messageType\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method getCampaignId()Ljava/lang/String;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/shopkick/app/campaigns/MessageHistoryRecord;->campaignId:Ljava/lang/String;

    return-object v0
.end method

.method getCampaignType()I
    .locals 1

    .line 99
    iget v0, p0, Lcom/shopkick/app/campaigns/MessageHistoryRecord;->campaignType:I

    return v0
.end method

.method getChainId()Ljava/lang/String;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/shopkick/app/campaigns/MessageHistoryRecord;->chainId:Ljava/lang/String;

    return-object v0
.end method

.method getDepartmentId()Ljava/lang/String;
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/shopkick/app/campaigns/MessageHistoryRecord;->departmentId:Ljava/lang/String;

    return-object v0
.end method

.method getLocationId()Ljava/lang/String;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/shopkick/app/campaigns/MessageHistoryRecord;->locationId:Ljava/lang/String;

    return-object v0
.end method

.method getMessageType()Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/shopkick/app/campaigns/MessageHistoryRecord;->messageType:Lcom/shopkick/app/campaigns/MessageHistoryRecord$MessageType;

    return-object v0
.end method

.method getTimestampMilliseconds()J
    .locals 2

    .line 90
    iget-wide v0, p0, Lcom/shopkick/app/campaigns/MessageHistoryRecord;->timestampMilliseconds:J

    return-wide v0
.end method
