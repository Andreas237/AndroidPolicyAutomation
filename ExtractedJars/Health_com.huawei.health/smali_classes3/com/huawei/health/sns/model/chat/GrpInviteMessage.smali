.class public Lcom/huawei/health/sns/model/chat/GrpInviteMessage;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/model/chat/GrpInviteMessage;>;"
        }
    .end annotation
.end field

.field private static final GROUP_ID:Ljava/lang/String; = "groupId"

.field private static final GROUP_MEMBER:Ljava/lang/String; = "groupMember"

.field private static final GROUP_MEMBER_COUNT:Ljava/lang/String; = "groupMemberCount"

.field private static final GROUP_NAME:Ljava/lang/String; = "groupName"

.field private static final IMAGE_URL:Ljava/lang/String; = "imageURL"

.field private static final IMAGE_URL_DOWNLOAD:Ljava/lang/String; = "imageURLDownload"

.field private static final OPERATOR_ID:Ljava/lang/String; = "operatorId"

.field private static final OPERATOR_NAME:Ljava/lang/String; = "operatorName"

.field private static final TAG:Ljava/lang/String; = "GrpInviteMessage"

.field private static final USER_ID:Ljava/lang/String; = "userId"

.field private static final USER_NAME:Ljava/lang/String; = "userName"


# instance fields
.field private groupId:J

.field private groupName:Ljava/lang/String;

.field private grpMemCount:I

.field private memberList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation
.end field

.field private operatorId:J

.field private operatorName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 108
    new-instance v0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage$4;

    invoke-direct {v0}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage$4;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->operatorId:J

    .line 82
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->operatorName:Ljava/lang/String;

    .line 83
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->groupId:J

    .line 84
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->groupName:Ljava/lang/String;

    .line 85
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->grpMemCount:I

    .line 86
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->memberList:Ljava/util/ArrayList;

    .line 87
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->memberList:Ljava/util/ArrayList;

    const-class v1, Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 88
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/huawei/health/sns/model/chat/GrpInviteMessage$4;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method private parseGroupMember(JLorg/json/JSONArray;)V
    .locals 5

    .line 184
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->memberList:Ljava/util/ArrayList;

    .line 185
    if-nez p3, :cond_0

    .line 187
    return-void

    .line 191
    :cond_0
    const/4 v2, 0x0

    .line 192
    const/4 v3, 0x0

    .line 193
    const/4 v4, 0x0

    :goto_0
    :try_start_0
    invoke-virtual {p3}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v4, v0, :cond_2

    .line 195
    invoke-virtual {p3, v4}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 196
    if-eqz v3, :cond_1

    .line 198
    new-instance v2, Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/group/GroupMember;-><init>()V

    .line 199
    invoke-virtual {v2, p1, p2}, Lcom/huawei/health/sns/model/group/GroupMember;->setGroupId(J)V

    .line 200
    const-string v0, "userId"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserId(J)V

    .line 201
    const-string v0, "userName"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserNickname(Ljava/lang/String;)V

    .line 202
    const-string v0, "imageURL"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserImageUrl(Ljava/lang/String;)V

    .line 203
    const-string v0, "imageURLDownload"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserImageDownloadUrl(Ljava/lang/String;)V

    .line 204
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->memberList:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 193
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 215
    :cond_2
    goto :goto_1

    .line 208
    :catch_0
    move-exception v2

    .line 210
    const-string v0, "GrpInviteMessage"

    const-string v1, "parseGroupMember error,RuntimeException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    goto :goto_1

    .line 212
    :catch_1
    move-exception v2

    .line 214
    const-string v0, "GrpInviteMessage"

    const-string v1, "parseGroupMember error,JSONException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    :goto_1
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 94
    const/4 v0, 0x0

    return v0
.end method

.method public getGroupId()J
    .locals 2

    .line 290
    iget-wide v0, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->groupId:J

    .line 291
    return-wide v0
.end method

.method public getGroupName()Ljava/lang/String;
    .locals 1

    .line 296
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->groupName:Ljava/lang/String;

    .line 297
    return-object v0
.end method

.method public getGrpMemCount()I
    .locals 1

    .line 302
    iget v0, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->grpMemCount:I

    .line 303
    return v0
.end method

.method public getJson()Ljava/lang/String;
    .locals 8

    .line 225
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 228
    const-string v0, "operatorId"

    :try_start_0
    iget-wide v1, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->operatorId:J

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 229
    const-string v0, "operatorName"

    iget-object v1, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->operatorName:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 230
    const-string v0, "groupId"

    iget-wide v1, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->groupId:J

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 231
    const-string v0, "groupName"

    iget-object v1, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->groupName:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 232
    const-string v0, "groupMemberCount"

    iget v1, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->grpMemCount:I

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 234
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->memberList:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->memberList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 236
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 237
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->memberList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 239
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 240
    const-string v0, "userId"

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v1

    invoke-virtual {v7, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 241
    const-string v0, "userName"

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserNickname()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 242
    const-string v0, "imageURL"

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 243
    const-string v0, "imageURLDownload"

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageDownloadUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 244
    invoke-virtual {v4, v7}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 245
    goto :goto_0

    .line 246
    :cond_0
    const-string v0, "groupMember"

    invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 252
    :cond_1
    goto :goto_1

    .line 249
    :catch_0
    move-exception v4

    .line 251
    const-string v0, "GrpInviteMessage"

    const-string v1, "get Json meet exception."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 253
    :goto_1
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getMemberList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation

    .line 313
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->memberList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getOperatorId()J
    .locals 2

    .line 278
    iget-wide v0, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->operatorId:J

    .line 279
    return-wide v0
.end method

.method public getOperatorName()Ljava/lang/String;
    .locals 1

    .line 284
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->operatorName:Ljava/lang/String;

    .line 285
    return-object v0
.end method

.method public parseJson(Ljava/lang/String;)V
    .locals 4

    .line 130
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 132
    return-void

    .line 137
    :cond_0
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 140
    const-string v0, "operatorId"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 142
    const-string v0, "operatorId"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->operatorId:J

    .line 144
    :cond_1
    const-string v0, "operatorName"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 146
    const-string v0, "operatorName"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->operatorName:Ljava/lang/String;

    .line 148
    :cond_2
    const-string v0, "groupId"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 150
    const-string v0, "groupId"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->groupId:J

    .line 152
    :cond_3
    const-string v0, "groupName"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 154
    const-string v0, "groupName"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->groupName:Ljava/lang/String;

    .line 156
    :cond_4
    const-string v0, "groupMemberCount"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 158
    const-string v0, "groupMemberCount"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->grpMemCount:I

    .line 161
    :cond_5
    const-string v0, "groupMember"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 163
    iget-wide v0, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->groupId:J

    const-string v2, "groupMember"

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->parseGroupMember(JLorg/json/JSONArray;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 173
    :cond_6
    goto :goto_0

    .line 166
    :catch_0
    move-exception v3

    .line 168
    const-string v0, "GrpInviteMessage"

    const-string v1, "parseJson error,RuntimeException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    goto :goto_0

    .line 170
    :catch_1
    move-exception v3

    .line 172
    const-string v0, "GrpInviteMessage"

    const-string v1, "parseJson error,JSONException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    :goto_0
    return-void
.end method

.method public setGroupId(J)V
    .locals 0

    .line 268
    iput-wide p1, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->groupId:J

    .line 269
    return-void
.end method

.method public setGroupName(Ljava/lang/String;)V
    .locals 0

    .line 273
    iput-object p1, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->groupName:Ljava/lang/String;

    .line 274
    return-void
.end method

.method public setGrpMemCount(I)V
    .locals 0

    .line 308
    iput p1, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->grpMemCount:I

    .line 309
    return-void
.end method

.method public setMemberList(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 318
    iput-object p1, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->memberList:Ljava/util/ArrayList;

    .line 319
    return-void
.end method

.method public setOperatorId(J)V
    .locals 0

    .line 258
    iput-wide p1, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->operatorId:J

    .line 259
    return-void
.end method

.method public setOperatorName(Ljava/lang/String;)V
    .locals 0

    .line 263
    iput-object p1, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->operatorName:Ljava/lang/String;

    .line 264
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 100
    iget-wide v0, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->operatorId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 101
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->operatorName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 102
    iget-wide v0, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->groupId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 103
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->groupName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 104
    iget v0, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->grpMemCount:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 105
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->memberList:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 106
    return-void
.end method
