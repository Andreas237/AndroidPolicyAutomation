.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfoOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfoOrBuilder;"
    }
.end annotation


# instance fields
.field private appId_:I

.field private authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItemOrBuilder;>;"
        }
    .end annotation
.end field

.field private authorizationList_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;>;"
        }
    .end annotation
.end field

.field private bitField0_:I

.field private cloudUserAppCode_:J

.field private huid_:J

.field private iconUrl_:Ljava/lang/Object;

.field private localUserAppCode_:I

.field private nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItemOrBuilder;>;"
        }
    .end annotation
.end field

.field private nameBundleList_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;>;"
        }
    .end annotation
.end field

.field private packageName_:Ljava/lang/Object;

.field private systemRating_:I

.field private type_:I

.field private version_:Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 4231
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 4524
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->packageName_:Ljava/lang/Object;

    .line 4600
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->version_:Ljava/lang/Object;

    .line 4836
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->iconUrl_:Ljava/lang/Object;

    .line 4912
    .line 4913
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationList_:Ljava/util/List;

    .line 5158
    .line 5159
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleList_:Ljava/util/List;

    .line 4232
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->maybeForceBuilderInitialization()V

    .line 4233
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 1

    .line 4237
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 4524
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->packageName_:Ljava/lang/Object;

    .line 4600
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->version_:Ljava/lang/Object;

    .line 4836
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->iconUrl_:Ljava/lang/Object;

    .line 4912
    .line 4913
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationList_:Ljava/util/List;

    .line 5158
    .line 5159
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleList_:Ljava/util/List;

    .line 4238
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->maybeForceBuilderInitialization()V

    .line 4239
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 4214
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$5700()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 1

    .line 4214
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 1

    .line 4247
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;-><init>()V

    return-object v0
.end method

.method private ensureAuthorizationListIsMutable()V
    .locals 2

    .line 4915
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit16 v0, v0, 0x200

    const/16 v1, 0x200

    if-eq v0, v1, :cond_0

    .line 4916
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationList_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationList_:Ljava/util/List;

    .line 4917
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x200

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4919
    :cond_0
    return-void
.end method

.method private ensureNameBundleListIsMutable()V
    .locals 2

    .line 5161
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit16 v0, v0, 0x400

    const/16 v1, 0x400

    if-eq v0, v1, :cond_0

    .line 5162
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleList_:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleList_:Ljava/util/List;

    .line 5163
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x400

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 5165
    :cond_0
    return-void
.end method

.method private getAuthorizationListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItemOrBuilder;>;"
        }
    .end annotation

    .line 5146
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 5147
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilder;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationList_:Ljava/util/List;

    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit16 v2, v2, 0x200

    const/16 v3, 0x200

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 5151
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v3

    .line 5152
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/RepeatedFieldBuilder;-><init>(Ljava/util/List;ZLcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 5153
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationList_:Ljava/util/List;

    .line 5155
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 4220
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$5400()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private getNameBundleListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/RepeatedFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItemOrBuilder;>;"
        }
    .end annotation

    .line 5392
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 5393
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilder;

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleList_:Ljava/util/List;

    iget v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit16 v2, v2, 0x400

    const/16 v3, 0x400

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 5397
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v3

    .line 5398
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->isClean()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/RepeatedFieldBuilder;-><init>(Ljava/util/List;ZLcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 5399
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleList_:Ljava/util/List;

    .line 5401
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 4241
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$5900()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4242
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->getAuthorizationListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 4243
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->getNameBundleListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 4245
    :cond_0
    return-void
.end method


# virtual methods
.method public addAllAuthorizationList(Ljava/lang/Iterable;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;>;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;"
        }
    .end annotation

    .line 5054
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 5055
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->ensureAuthorizationListIsMutable()V

    .line 5056
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationList_:Ljava/util/List;

    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 5058
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    goto :goto_0

    .line 5060
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 5062
    :goto_0
    return-object p0
.end method

.method public addAllNameBundleList(Ljava/lang/Iterable;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Iterable<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;>;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;"
        }
    .end annotation

    .line 5300
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 5301
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->ensureNameBundleListIsMutable()V

    .line 5302
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleList_:Ljava/util/List;

    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 5304
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    goto :goto_0

    .line 5306
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 5308
    :goto_0
    return-object p0
.end method

.method public addAuthorizationList(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 5040
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 5041
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->ensureAuthorizationListIsMutable()V

    .line 5042
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationList_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 5043
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    goto :goto_0

    .line 5045
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 5047
    :goto_0
    return-object p0
.end method

.method public addAuthorizationList(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 1

    .line 5009
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 5010
    if-nez p2, :cond_0

    .line 5011
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 5013
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->ensureAuthorizationListIsMutable()V

    .line 5014
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationList_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 5015
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    goto :goto_0

    .line 5017
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 5019
    :goto_0
    return-object p0
.end method

.method public addAuthorizationList(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 5026
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 5027
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->ensureAuthorizationListIsMutable()V

    .line 5028
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationList_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5029
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    goto :goto_0

    .line 5031
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 5033
    :goto_0
    return-object p0
.end method

.method public addAuthorizationList(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 1

    .line 4992
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 4993
    if-nez p1, :cond_0

    .line 4994
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 4996
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->ensureAuthorizationListIsMutable()V

    .line 4997
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4998
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    goto :goto_0

    .line 5000
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 5002
    :goto_0
    return-object p0
.end method

.method public addAuthorizationListBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;
    .locals 2

    .line 5125
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->getAuthorizationListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 5126
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    move-result-object v1

    .line 5125
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    return-object v0
.end method

.method public addAuthorizationListBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;
    .locals 2

    .line 5133
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->getAuthorizationListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 5134
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    move-result-object v1

    .line 5133
    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    return-object v0
.end method

.method public addNameBundleList(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 5286
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 5287
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->ensureNameBundleListIsMutable()V

    .line 5288
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleList_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 5289
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    goto :goto_0

    .line 5291
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 5293
    :goto_0
    return-object p0
.end method

.method public addNameBundleList(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 1

    .line 5255
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 5256
    if-nez p2, :cond_0

    .line 5257
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 5259
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->ensureNameBundleListIsMutable()V

    .line 5260
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleList_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 5261
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    goto :goto_0

    .line 5263
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 5265
    :goto_0
    return-object p0
.end method

.method public addNameBundleList(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 5272
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 5273
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->ensureNameBundleListIsMutable()V

    .line 5274
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleList_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5275
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    goto :goto_0

    .line 5277
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 5279
    :goto_0
    return-object p0
.end method

.method public addNameBundleList(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 1

    .line 5238
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 5239
    if-nez p1, :cond_0

    .line 5240
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 5242
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->ensureNameBundleListIsMutable()V

    .line 5243
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5244
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    goto :goto_0

    .line 5246
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 5248
    :goto_0
    return-object p0
.end method

.method public addNameBundleListBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;
    .locals 2

    .line 5371
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->getNameBundleListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 5372
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    move-result-object v1

    .line 5371
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    return-object v0
.end method

.method public addNameBundleListBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;
    .locals 2

    .line 5379
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->getNameBundleListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    .line 5380
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    move-result-object v1

    .line 5379
    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addBuilder(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 4214
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 4214
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;
    .locals 2

    .line 4299
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    move-result-object v1

    .line 4300
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4301
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 4303
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 4214
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 4214
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;
    .locals 5

    .line 4307
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 4308
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4309
    const/4 v4, 0x0

    .line 4310
    and-int/lit8 v0, v3, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 4311
    const/4 v4, 0x1

    .line 4313
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->appId_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$6102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;I)I

    .line 4314
    and-int/lit8 v0, v3, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 4315
    or-int/lit8 v4, v4, 0x2

    .line 4317
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->packageName_:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$6202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4318
    and-int/lit8 v0, v3, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 4319
    or-int/lit8 v4, v4, 0x4

    .line 4321
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->version_:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$6302(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4322
    and-int/lit8 v0, v3, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    .line 4323
    or-int/lit8 v4, v4, 0x8

    .line 4325
    :cond_3
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->localUserAppCode_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$6402(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;I)I

    .line 4326
    and-int/lit8 v0, v3, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_4

    .line 4327
    or-int/lit8 v4, v4, 0x10

    .line 4329
    :cond_4
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->cloudUserAppCode_:J

    invoke-static {v2, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$6502(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;J)J

    .line 4330
    and-int/lit8 v0, v3, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_5

    .line 4331
    or-int/lit8 v4, v4, 0x20

    .line 4333
    :cond_5
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->huid_:J

    invoke-static {v2, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$6602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;J)J

    .line 4334
    and-int/lit8 v0, v3, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_6

    .line 4335
    or-int/lit8 v4, v4, 0x40

    .line 4337
    :cond_6
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->type_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$6702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;I)I

    .line 4338
    and-int/lit16 v0, v3, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_7

    .line 4339
    or-int/lit16 v4, v4, 0x80

    .line 4341
    :cond_7
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->systemRating_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$6802(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;I)I

    .line 4342
    and-int/lit16 v0, v3, 0x100

    const/16 v1, 0x100

    if-ne v0, v1, :cond_8

    .line 4343
    or-int/lit16 v4, v4, 0x100

    .line 4345
    :cond_8
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->iconUrl_:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$6902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4346
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_a

    .line 4347
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit16 v0, v0, 0x200

    const/16 v1, 0x200

    if-ne v0, v1, :cond_9

    .line 4348
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationList_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationList_:Ljava/util/List;

    .line 4349
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x201

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4351
    :cond_9
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationList_:Ljava/util/List;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$7002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;Ljava/util/List;)Ljava/util/List;

    goto :goto_0

    .line 4353
    :cond_a
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->build()Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$7002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;Ljava/util/List;)Ljava/util/List;

    .line 4355
    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_c

    .line 4356
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit16 v0, v0, 0x400

    const/16 v1, 0x400

    if-ne v0, v1, :cond_b

    .line 4357
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleList_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleList_:Ljava/util/List;

    .line 4358
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x401

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4360
    :cond_b
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleList_:Ljava/util/List;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$7102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;Ljava/util/List;)Ljava/util/List;

    goto :goto_1

    .line 4362
    :cond_c
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->build()Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$7102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;Ljava/util/List;)Ljava/util/List;

    .line 4364
    :goto_1
    invoke-static {v2, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$7202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;I)I

    .line 4365
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onBuilt()V

    .line 4366
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 4214
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 4214
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4214
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 4214
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 4251
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 4252
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->appId_:I

    .line 4253
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4254
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->packageName_:Ljava/lang/Object;

    .line 4255
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4256
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->version_:Ljava/lang/Object;

    .line 4257
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4258
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->localUserAppCode_:I

    .line 4259
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4260
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->cloudUserAppCode_:J

    .line 4261
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4262
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->huid_:J

    .line 4263
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4264
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->type_:I

    .line 4265
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4266
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->systemRating_:I

    .line 4267
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4268
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->iconUrl_:Ljava/lang/Object;

    .line 4269
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4270
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 4271
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationList_:Ljava/util/List;

    .line 4272
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x201

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    goto :goto_0

    .line 4274
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 4276
    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 4277
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleList_:Ljava/util/List;

    .line 4278
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x401

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    goto :goto_1

    .line 4280
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 4282
    :goto_1
    return-object p0
.end method

.method public clearAppId()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 4518
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4519
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->appId_:I

    .line 4520
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    .line 4521
    return-object p0
.end method

.method public clearAuthorizationList()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 5068
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 5069
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationList_:Ljava/util/List;

    .line 5070
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x201

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 5071
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    goto :goto_0

    .line 5073
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 5075
    :goto_0
    return-object p0
.end method

.method public clearCloudUserAppCode()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 4734
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4735
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->cloudUserAppCode_:J

    .line 4736
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    .line 4737
    return-object p0
.end method

.method public clearHuid()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 4766
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4767
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->huid_:J

    .line 4768
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    .line 4769
    return-object p0
.end method

.method public clearIconUrl()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 4893
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4894
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getIconUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->iconUrl_:Ljava/lang/Object;

    .line 4895
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    .line 4896
    return-object p0
.end method

.method public clearLocalUserAppCode()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 4702
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4703
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->localUserAppCode_:I

    .line 4704
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    .line 4705
    return-object p0
.end method

.method public clearNameBundleList()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 5314
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 5315
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleList_:Ljava/util/List;

    .line 5316
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x401

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 5317
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    goto :goto_0

    .line 5319
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->clear()V

    .line 5321
    :goto_0
    return-object p0
.end method

.method public clearPackageName()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 4581
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4582
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->packageName_:Ljava/lang/Object;

    .line 4583
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    .line 4584
    return-object p0
.end method

.method public clearSystemRating()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 4830
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4831
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->systemRating_:I

    .line 4832
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    .line 4833
    return-object p0
.end method

.method public clearType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 4798
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4799
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->type_:I

    .line 4800
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    .line 4801
    return-object p0
.end method

.method public clearVersion()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 4657
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4658
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getVersion()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->version_:Ljava/lang/Object;

    .line 4659
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    .line 4660
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 4214
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 4214
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 4214
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4214
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 4214
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 4286
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 4214
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public getAppId()I
    .locals 1

    .line 4503
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->appId_:I

    return v0
.end method

.method public getAuthorizationList(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;
    .locals 1

    .line 4948
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 4949
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 4950
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 4952
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    return-object v0

    .line 4954
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessage(I)Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    return-object v0
.end method

.method public getAuthorizationListBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;
    .locals 1

    .line 5095
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->getAuthorizationListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilder(I)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;

    return-object v0
.end method

.method public getAuthorizationListBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;>;"
        }
    .end annotation

    .line 5141
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->getAuthorizationListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getAuthorizationListCount()I
    .locals 1

    .line 4938
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 4939
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 4941
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getCount()I

    move-result v0

    return v0
.end method

.method public getAuthorizationListList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;>;"
        }
    .end annotation

    .line 4928
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 4929
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationList_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 4931
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getAuthorizationListOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItemOrBuilder;
    .locals 1

    .line 5102
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 5103
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 5104
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 5106
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItemOrBuilder;

    return-object v0

    .line 5107
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilder(I)Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItemOrBuilder;

    return-object v0
.end method

.method public getAuthorizationListOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItemOrBuilder;>;"
        }
    .end annotation

    .line 5115
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-eqz v0, :cond_0

    .line 5116
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 5118
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationList_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getCloudUserAppCode()J
    .locals 2

    .line 4719
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->cloudUserAppCode_:J

    return-wide v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 4214
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 4214
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;
    .locals 1

    .line 4295
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 4291
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$5400()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getHuid()J
    .locals 2

    .line 4751
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->huid_:J

    return-wide v0
.end method

.method public getIconUrl()Ljava/lang/String;
    .locals 4

    .line 4847
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->iconUrl_:Ljava/lang/Object;

    .line 4848
    instance-of v0, v1, Ljava/lang/String;

    if-nez v0, :cond_1

    .line 4849
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 4851
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 4852
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4853
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->iconUrl_:Ljava/lang/Object;

    .line 4855
    :cond_0
    return-object v3

    .line 4857
    :cond_1
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getIconUrlBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 4865
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->iconUrl_:Ljava/lang/Object;

    .line 4866
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 4867
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 4868
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 4870
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->iconUrl_:Ljava/lang/Object;

    .line 4871
    return-object v2

    .line 4873
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getLocalUserAppCode()I
    .locals 1

    .line 4687
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->localUserAppCode_:I

    return v0
.end method

.method public getNameBundleList(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;
    .locals 1

    .line 5194
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 5195
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 5196
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 5198
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    return-object v0

    .line 5200
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessage(I)Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    return-object v0
.end method

.method public getNameBundleListBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;
    .locals 1

    .line 5341
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->getNameBundleListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilder(I)Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;

    return-object v0
.end method

.method public getNameBundleListBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;>;"
        }
    .end annotation

    .line 5387
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->getNameBundleListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getNameBundleListCount()I
    .locals 1

    .line 5184
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 5185
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 5187
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getCount()I

    move-result v0

    return v0
.end method

.method public getNameBundleListList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;>;"
        }
    .end annotation

    .line 5174
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 5175
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleList_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 5177
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getNameBundleListOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItemOrBuilder;
    .locals 1

    .line 5348
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_2

    .line 5349
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 5350
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 5352
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItemOrBuilder;

    return-object v0

    .line 5353
    :cond_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilder(I)Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItemOrBuilder;

    return-object v0
.end method

.method public getNameBundleListOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItemOrBuilder;>;"
        }
    .end annotation

    .line 5361
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-eqz v0, :cond_0

    .line 5362
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->getMessageOrBuilderList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 5364
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleList_:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 4

    .line 4535
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->packageName_:Ljava/lang/Object;

    .line 4536
    instance-of v0, v1, Ljava/lang/String;

    if-nez v0, :cond_1

    .line 4537
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 4539
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 4540
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4541
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->packageName_:Ljava/lang/Object;

    .line 4543
    :cond_0
    return-object v3

    .line 4545
    :cond_1
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getPackageNameBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 4553
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->packageName_:Ljava/lang/Object;

    .line 4554
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 4555
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 4556
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 4558
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->packageName_:Ljava/lang/Object;

    .line 4559
    return-object v2

    .line 4561
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getSystemRating()I
    .locals 1

    .line 4815
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->systemRating_:I

    return v0
.end method

.method public getType()I
    .locals 1

    .line 4783
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->type_:I

    return v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 4

    .line 4611
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->version_:Ljava/lang/Object;

    .line 4612
    instance-of v0, v1, Ljava/lang/String;

    if-nez v0, :cond_1

    .line 4613
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 4615
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 4616
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4617
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->version_:Ljava/lang/Object;

    .line 4619
    :cond_0
    return-object v3

    .line 4621
    :cond_1
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getVersionBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 4629
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->version_:Ljava/lang/Object;

    .line 4630
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 4631
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 4632
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 4634
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->version_:Ljava/lang/Object;

    .line 4635
    return-object v2

    .line 4637
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public hasAppId()Z
    .locals 2

    .line 4497
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasCloudUserAppCode()Z
    .locals 2

    .line 4713
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasHuid()Z
    .locals 2

    .line 4745
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasIconUrl()Z
    .locals 2

    .line 4841
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit16 v0, v0, 0x100

    const/16 v1, 0x100

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasLocalUserAppCode()Z
    .locals 2

    .line 4681
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasPackageName()Z
    .locals 2

    .line 4529
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasSystemRating()Z
    .locals 2

    .line 4809
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit16 v0, v0, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasType()Z
    .locals 2

    .line 4777
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasVersion()Z
    .locals 2

    .line 4605
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 4225
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$5500()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    .line 4226
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 4225
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 4470
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 4214
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 4214
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 4214
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 4214
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4214
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 4214
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 4477
    const/4 v1, 0x0

    .line 4479
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$100()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 4484
    if-eqz v1, :cond_1

    .line 4485
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    goto :goto_0

    .line 4480
    :catch_0
    move-exception v2

    .line 4481
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    move-object v1, v0

    .line 4482
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 4484
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 4485
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    .line 4487
    :cond_0
    throw v3

    .line 4488
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 1

    .line 4370
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    if-eqz v0, :cond_0

    .line 4371
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    move-result-object v0

    return-object v0

    .line 4373
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 4374
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 4379
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 4380
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->hasAppId()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4381
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getAppId()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->setAppId(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    .line 4383
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->hasPackageName()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 4384
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4385
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$6200(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->packageName_:Ljava/lang/Object;

    .line 4386
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    .line 4388
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->hasVersion()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 4389
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4390
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$6300(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->version_:Ljava/lang/Object;

    .line 4391
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    .line 4393
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->hasLocalUserAppCode()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 4394
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getLocalUserAppCode()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->setLocalUserAppCode(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    .line 4396
    :cond_4
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->hasCloudUserAppCode()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 4397
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getCloudUserAppCode()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->setCloudUserAppCode(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    .line 4399
    :cond_5
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->hasHuid()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 4400
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getHuid()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->setHuid(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    .line 4402
    :cond_6
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->hasType()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 4403
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getType()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->setType(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    .line 4405
    :cond_7
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->hasSystemRating()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 4406
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getSystemRating()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->setSystemRating(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;

    .line 4408
    :cond_8
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->hasIconUrl()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 4409
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4410
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$6900(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->iconUrl_:Ljava/lang/Object;

    .line 4411
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    .line 4413
    :cond_9
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_b

    .line 4414
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$7000(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_e

    .line 4415
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 4416
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$7000(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationList_:Ljava/util/List;

    .line 4417
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x201

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    goto :goto_0

    .line 4419
    :cond_a
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->ensureAuthorizationListIsMutable()V

    .line 4420
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationList_:Ljava/util/List;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$7000(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 4422
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    goto :goto_2

    .line 4425
    :cond_b
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$7000(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_e

    .line 4426
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 4427
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->dispose()V

    .line 4428
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 4429
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$7000(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationList_:Ljava/util/List;

    .line 4430
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x201

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4431
    .line 4432
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$7300()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 4433
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->getAuthorizationListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    goto :goto_1

    :cond_c
    const/4 v0, 0x0

    :goto_1
    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    goto :goto_2

    .line 4435
    :cond_d
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$7000(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 4439
    :cond_e
    :goto_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_10

    .line 4440
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$7100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_13

    .line 4441
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleList_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 4442
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$7100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleList_:Ljava/util/List;

    .line 4443
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x401

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    goto :goto_3

    .line 4445
    :cond_f
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->ensureNameBundleListIsMutable()V

    .line 4446
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleList_:Ljava/util/List;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$7100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 4448
    :goto_3
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    goto :goto_5

    .line 4451
    :cond_10
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$7100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_13

    .line 4452
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_12

    .line 4453
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilder;->dispose()V

    .line 4454
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 4455
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$7100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleList_:Ljava/util/List;

    .line 4456
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x401

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4457
    .line 4458
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$7400()Z

    move-result v0

    if-eqz v0, :cond_11

    .line 4459
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->getNameBundleListFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilder;

    move-result-object v0

    goto :goto_4

    :cond_11
    const/4 v0, 0x0

    :goto_4
    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    goto :goto_5

    .line 4461
    :cond_12
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->access$7100(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 4465
    :cond_13
    :goto_5
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 4466
    return-object p0
.end method

.method public removeAuthorizationList(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 1

    .line 5081
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 5082
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->ensureAuthorizationListIsMutable()V

    .line 5083
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 5084
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    goto :goto_0

    .line 5086
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->remove(I)V

    .line 5088
    :goto_0
    return-object p0
.end method

.method public removeNameBundleList(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 1

    .line 5327
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 5328
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->ensureNameBundleListIsMutable()V

    .line 5329
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleList_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 5330
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    goto :goto_0

    .line 5332
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilder;->remove(I)V

    .line 5334
    :goto_0
    return-object p0
.end method

.method public setAppId(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 4509
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4510
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->appId_:I

    .line 4511
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    .line 4512
    return-object p0
.end method

.method public setAuthorizationList(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 4979
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 4980
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->ensureAuthorizationListIsMutable()V

    .line 4981
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationList_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 4982
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    goto :goto_0

    .line 4984
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 4986
    :goto_0
    return-object p0
.end method

.method public setAuthorizationList(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 1

    .line 4962
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 4963
    if-nez p2, :cond_0

    .line 4964
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 4966
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->ensureAuthorizationListIsMutable()V

    .line 4967
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationList_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 4968
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    goto :goto_0

    .line 4970
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->authorizationListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 4972
    :goto_0
    return-object p0
.end method

.method public setCloudUserAppCode(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 4725
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4726
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->cloudUserAppCode_:J

    .line 4727
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    .line 4728
    return-object p0
.end method

.method public setHuid(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 4757
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4758
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->huid_:J

    .line 4759
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    .line 4760
    return-object p0
.end method

.method public setIconUrl(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 4881
    if-nez p1, :cond_0

    .line 4882
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 4884
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4885
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->iconUrl_:Ljava/lang/Object;

    .line 4886
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    .line 4887
    return-object p0
.end method

.method public setIconUrlBytes(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 4903
    if-nez p1, :cond_0

    .line 4904
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 4906
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4907
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->iconUrl_:Ljava/lang/Object;

    .line 4908
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    .line 4909
    return-object p0
.end method

.method public setLocalUserAppCode(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 4693
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4694
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->localUserAppCode_:I

    .line 4695
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    .line 4696
    return-object p0
.end method

.method public setNameBundleList(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 5225
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_0

    .line 5226
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->ensureNameBundleListIsMutable()V

    .line 5227
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleList_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 5228
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    goto :goto_0

    .line 5230
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 5232
    :goto_0
    return-object p0
.end method

.method public setNameBundleList(ILcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 1

    .line 5208
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    if-nez v0, :cond_1

    .line 5209
    if-nez p2, :cond_0

    .line 5210
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 5212
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->ensureNameBundleListIsMutable()V

    .line 5213
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleList_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 5214
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    goto :goto_0

    .line 5216
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->nameBundleListBuilder_:Lcom/google/protobuf/RepeatedFieldBuilder;

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilder;->setMessage(ILcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/RepeatedFieldBuilder;

    .line 5218
    :goto_0
    return-object p0
.end method

.method public setPackageName(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 4569
    if-nez p1, :cond_0

    .line 4570
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 4572
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4573
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->packageName_:Ljava/lang/Object;

    .line 4574
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    .line 4575
    return-object p0
.end method

.method public setPackageNameBytes(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 4591
    if-nez p1, :cond_0

    .line 4592
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 4594
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4595
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->packageName_:Ljava/lang/Object;

    .line 4596
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    .line 4597
    return-object p0
.end method

.method public setSystemRating(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 4821
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4822
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->systemRating_:I

    .line 4823
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    .line 4824
    return-object p0
.end method

.method public setType(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 4789
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4790
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->type_:I

    .line 4791
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    .line 4792
    return-object p0
.end method

.method public setVersion(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 4645
    if-nez p1, :cond_0

    .line 4646
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 4648
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4649
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->version_:Ljava/lang/Object;

    .line 4650
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    .line 4651
    return-object p0
.end method

.method public setVersionBytes(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;
    .locals 2

    .line 4667
    if-nez p1, :cond_0

    .line 4668
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 4670
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->bitField0_:I

    .line 4671
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->version_:Ljava/lang/Object;

    .line 4672
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfo$Builder;->onChanged()V

    .line 4673
    return-object p0
.end method
