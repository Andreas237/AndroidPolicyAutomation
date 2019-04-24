.class public Lcom/huawei/health/sns/model/chat/Assistant;
.super Lcom/huawei/health/sns/model/user/User;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/model/chat/Assistant;>;"
        }
    .end annotation
.end field


# instance fields
.field private appId:Ljava/lang/String;

.field private assistantChannel:Ljava/lang/String;

.field private company:Ljava/lang/String;

.field private defaultMsg:Ljava/lang/String;

.field private emuiOnly:Ljava/lang/String;

.field private introduction:Ljava/lang/String;

.field private menu:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private packageName:Ljava/lang/String;

.field private requireVersion:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 184
    new-instance v0, Lcom/huawei/health/sns/model/chat/Assistant$1;

    invoke-direct {v0}, Lcom/huawei/health/sns/model/chat/Assistant$1;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/model/chat/Assistant;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 216
    invoke-direct {p0}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 217
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 202
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/model/user/User;-><init>(Landroid/os/Parcel;)V

    .line 203
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/Assistant;->introduction:Ljava/lang/String;

    .line 204
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/Assistant;->menu:Ljava/lang/String;

    .line 205
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/Assistant;->assistantChannel:Ljava/lang/String;

    .line 206
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/Assistant;->defaultMsg:Ljava/lang/String;

    .line 207
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/Assistant;->emuiOnly:Ljava/lang/String;

    .line 208
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/Assistant;->appId:Ljava/lang/String;

    .line 209
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/Assistant;->name:Ljava/lang/String;

    .line 210
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/Assistant;->packageName:Ljava/lang/String;

    .line 211
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/Assistant;->requireVersion:Ljava/lang/String;

    .line 212
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/Assistant;->company:Ljava/lang/String;

    .line 213
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/huawei/health/sns/model/chat/Assistant$1;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/model/chat/Assistant;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 250
    invoke-super {p0, p1}, Lcom/huawei/health/sns/model/user/User;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public getAppId()Ljava/lang/String;
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/Assistant;->appId:Ljava/lang/String;

    .line 141
    return-object v0
.end method

.method public getCompany()Ljava/lang/String;
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/Assistant;->company:Ljava/lang/String;

    .line 165
    return-object v0
.end method

.method public getDefaultMsg()Ljava/lang/String;
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/Assistant;->defaultMsg:Ljava/lang/String;

    .line 102
    return-object v0
.end method

.method public getEmuiOnly()Ljava/lang/String;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/Assistant;->emuiOnly:Ljava/lang/String;

    .line 108
    return-object v0
.end method

.method public getIntroduction()Ljava/lang/String;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/Assistant;->introduction:Ljava/lang/String;

    .line 81
    return-object v0
.end method

.method public getMenu()Ljava/lang/String;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/Assistant;->menu:Ljava/lang/String;

    .line 87
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/Assistant;->name:Ljava/lang/String;

    .line 147
    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/Assistant;->packageName:Ljava/lang/String;

    .line 153
    return-object v0
.end method

.method public getRequireVersion()Ljava/lang/String;
    .locals 1

    .line 158
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/Assistant;->requireVersion:Ljava/lang/String;

    .line 159
    return-object v0
.end method

.method public hasAppinfo()Z
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/Assistant;->emuiOnly:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 256
    invoke-super {p0}, Lcom/huawei/health/sns/model/user/User;->hashCode()I

    move-result v0

    return v0
.end method

.method public isEmuiOnly()Z
    .locals 2

    .line 126
    const-string v0, "true"

    iget-object v1, p0, Lcom/huawei/health/sns/model/chat/Assistant;->emuiOnly:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public parseAssistAppInfo(Ljava/lang/String;)V
    .locals 7

    .line 228
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 230
    return-void

    .line 234
    :cond_0
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 235
    move-object v0, p0

    const-string v1, "emui_only"

    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "appid"

    .line 236
    invoke-virtual {v6, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "name"

    .line 237
    invoke-virtual {v6, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "package"

    .line 238
    invoke-virtual {v6, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "require_version"

    .line 239
    invoke-virtual {v6, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 235
    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/sns/model/chat/Assistant;->setAppInfoData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 244
    goto :goto_0

    .line 241
    :catch_0
    move-exception v6

    .line 243
    const-string v0, "Assistant"

    const-string v1, "parseAssistAppInfo error,JSONException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    :goto_0
    return-void
.end method

.method public setAppInfoData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 131
    iput-object p1, p0, Lcom/huawei/health/sns/model/chat/Assistant;->emuiOnly:Ljava/lang/String;

    .line 132
    iput-object p2, p0, Lcom/huawei/health/sns/model/chat/Assistant;->appId:Ljava/lang/String;

    .line 133
    iput-object p3, p0, Lcom/huawei/health/sns/model/chat/Assistant;->name:Ljava/lang/String;

    .line 134
    iput-object p4, p0, Lcom/huawei/health/sns/model/chat/Assistant;->packageName:Ljava/lang/String;

    .line 135
    iput-object p5, p0, Lcom/huawei/health/sns/model/chat/Assistant;->requireVersion:Ljava/lang/String;

    .line 136
    return-void
.end method

.method public setSomeInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/huawei/health/sns/model/chat/Assistant;->assistantChannel:Ljava/lang/String;

    .line 93
    iput-object p2, p0, Lcom/huawei/health/sns/model/chat/Assistant;->defaultMsg:Ljava/lang/String;

    .line 94
    iput-object p3, p0, Lcom/huawei/health/sns/model/chat/Assistant;->company:Ljava/lang/String;

    .line 95
    iput-object p4, p0, Lcom/huawei/health/sns/model/chat/Assistant;->introduction:Ljava/lang/String;

    .line 96
    iput-object p5, p0, Lcom/huawei/health/sns/model/chat/Assistant;->menu:Ljava/lang/String;

    .line 97
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 171
    invoke-super {p0, p1, p2}, Lcom/huawei/health/sns/model/user/User;->writeToParcel(Landroid/os/Parcel;I)V

    .line 172
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/Assistant;->introduction:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 173
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/Assistant;->menu:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 174
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/Assistant;->assistantChannel:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 175
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/Assistant;->defaultMsg:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 176
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/Assistant;->emuiOnly:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 177
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/Assistant;->appId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 178
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/Assistant;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 179
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/Assistant;->packageName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 180
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/Assistant;->requireVersion:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 181
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/Assistant;->company:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 182
    return-void
.end method
