.class public interface abstract Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AppInfoOrBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "AppInfoOrBuilder"
.end annotation


# virtual methods
.method public abstract getAppId()I
.end method

.method public abstract getAuthorizationList(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;
.end method

.method public abstract getAuthorizationListCount()I
.end method

.method public abstract getAuthorizationListList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItem;>;"
        }
    .end annotation
.end method

.method public abstract getAuthorizationListOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItemOrBuilder;
.end method

.method public abstract getAuthorizationListOrBuilderList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$AuthorizationItemOrBuilder;>;"
        }
    .end annotation
.end method

.method public abstract getCloudUserAppCode()J
.end method

.method public abstract getHuid()J
.end method

.method public abstract getIconUrl()Ljava/lang/String;
.end method

.method public abstract getIconUrlBytes()Lcom/google/protobuf/ByteString;
.end method

.method public abstract getLocalUserAppCode()I
.end method

.method public abstract getNameBundleList(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;
.end method

.method public abstract getNameBundleListCount()I
.end method

.method public abstract getNameBundleListList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItem;>;"
        }
    .end annotation
.end method

.method public abstract getNameBundleListOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItemOrBuilder;
.end method

.method public abstract getNameBundleListOrBuilderList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$NameBundleItemOrBuilder;>;"
        }
    .end annotation
.end method

.method public abstract getPackageName()Ljava/lang/String;
.end method

.method public abstract getPackageNameBytes()Lcom/google/protobuf/ByteString;
.end method

.method public abstract getSystemRating()I
.end method

.method public abstract getType()I
.end method

.method public abstract getVersion()Ljava/lang/String;
.end method

.method public abstract getVersionBytes()Lcom/google/protobuf/ByteString;
.end method

.method public abstract hasAppId()Z
.end method

.method public abstract hasCloudUserAppCode()Z
.end method

.method public abstract hasHuid()Z
.end method

.method public abstract hasIconUrl()Z
.end method

.method public abstract hasLocalUserAppCode()Z
.end method

.method public abstract hasPackageName()Z
.end method

.method public abstract hasSystemRating()Z
.end method

.method public abstract hasType()Z
.end method

.method public abstract hasVersion()Z
.end method
