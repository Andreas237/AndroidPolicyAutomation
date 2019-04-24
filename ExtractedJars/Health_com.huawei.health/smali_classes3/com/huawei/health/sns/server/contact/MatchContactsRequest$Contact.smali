.class public Lcom/huawei/health/sns/server/contact/MatchContactsRequest$Contact;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/contact/MatchContactsRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Contact"
.end annotation


# instance fields
.field public phoneDigest_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getPhoneDigest_()Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/health/sns/server/contact/MatchContactsRequest$Contact;->phoneDigest_:Ljava/lang/String;

    return-object v0
.end method

.method public setPhoneDigest_(Ljava/lang/String;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/huawei/health/sns/server/contact/MatchContactsRequest$Contact;->phoneDigest_:Ljava/lang/String;

    .line 41
    return-void
.end method
