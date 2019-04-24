.class public Lcom/huawei/health/sns/server/contact/MatchContactsResponse$MatchContactsRsp;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/contact/MatchContactsResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MatchContactsRsp"
.end annotation


# instance fields
.field private contactInfoList_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 27
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$MatchContactsRsp;->contactInfoList_:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getContactInfoList_()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;>;"
        }
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$MatchContactsRsp;->contactInfoList_:Ljava/util/List;

    return-object v0
.end method
