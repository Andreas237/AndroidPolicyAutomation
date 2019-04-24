.class public Lcom/huawei/health/sns/model/chat/AssistantMenu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/model/chat/AssistantMenu;>;"
        }
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "AssistantMenu"

.field public static final TYPE_CLICK:Ljava/lang/String; = "click"

.field public static final TYPE_VIEW:Ljava/lang/String; = "view"


# instance fields
.field private key:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private sub_button:Ljava/lang/String;

.field private type:Ljava/lang/String;

.field private url:Ljava/lang/String;

.field private xPosition:I

.field private yPosition:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 126
    new-instance v0, Lcom/huawei/health/sns/model/chat/AssistantMenu$2;

    invoke-direct {v0}, Lcom/huawei/health/sns/model/chat/AssistantMenu$2;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/model/chat/AssistantMenu;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/AssistantMenu;->xPosition:I

    .line 74
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/AssistantMenu;->yPosition:I

    .line 108
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 143
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/AssistantMenu;->xPosition:I

    .line 74
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/model/chat/AssistantMenu;->yPosition:I

    .line 144
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/AssistantMenu;->type:Ljava/lang/String;

    .line 145
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/AssistantMenu;->name:Ljava/lang/String;

    .line 146
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/AssistantMenu;->key:Ljava/lang/String;

    .line 147
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/AssistantMenu;->url:Ljava/lang/String;

    .line 148
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/chat/AssistantMenu;->sub_button:Ljava/lang/String;

    .line 149
    return-void
.end method

.method public static parseAssistMenu(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/AssistantMenu;>;"
        }
    .end annotation

    .line 160
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 161
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 163
    const-string v0, "AssistantMenu"

    const-string v1, "parseAssistMenu json is null."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    return-object v2

    .line 166
    :cond_0
    const/4 v3, 0x0

    .line 167
    const/4 v4, 0x0

    .line 170
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 171
    const-string v0, "button"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 172
    if-eqz v4, :cond_1

    .line 174
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 176
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    .line 177
    new-instance v7, Lcom/huawei/health/sns/model/chat/AssistantMenu;

    invoke-direct {v7}, Lcom/huawei/health/sns/model/chat/AssistantMenu;-><init>()V

    .line 178
    invoke-virtual {v7, v5}, Lcom/huawei/health/sns/model/chat/AssistantMenu;->setxPosition(I)V

    .line 179
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/chat/AssistantMenu;->setyPosition(I)V

    .line 180
    const-string v0, "type"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v7, Lcom/huawei/health/sns/model/chat/AssistantMenu;->type:Ljava/lang/String;

    .line 181
    const-string v0, "name"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v7, Lcom/huawei/health/sns/model/chat/AssistantMenu;->name:Ljava/lang/String;

    .line 182
    const-string v0, "key"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v7, Lcom/huawei/health/sns/model/chat/AssistantMenu;->key:Ljava/lang/String;

    .line 183
    const-string v0, "url"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v7, Lcom/huawei/health/sns/model/chat/AssistantMenu;->url:Ljava/lang/String;

    .line 184
    const-string v0, "sub_button"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v7, Lcom/huawei/health/sns/model/chat/AssistantMenu;->sub_button:Ljava/lang/String;

    .line 185
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 174
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 196
    :cond_1
    goto :goto_1

    .line 189
    :catch_0
    move-exception v5

    .line 191
    const-string v0, "AssistantMenu"

    const-string v1, "parseAssistMenu error,RuntimeException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    goto :goto_1

    .line 193
    :catch_1
    move-exception v5

    .line 195
    const-string v0, "AssistantMenu"

    const-string v1, "parseAssistMenu error,JSONException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    :goto_1
    return-object v2
.end method

.method public static parseAssistSubMenu(Ljava/lang/String;I)Ljava/util/ArrayList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;I)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/AssistantMenu;>;"
        }
    .end annotation

    .line 209
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 210
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 212
    return-object v2

    .line 214
    :cond_0
    const/4 v3, 0x0

    .line 217
    :try_start_0
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 218
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v4

    .line 219
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    .line 221
    invoke-virtual {v3, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    .line 222
    new-instance v7, Lcom/huawei/health/sns/model/chat/AssistantMenu;

    invoke-direct {v7}, Lcom/huawei/health/sns/model/chat/AssistantMenu;-><init>()V

    .line 223
    invoke-virtual {v7, p1}, Lcom/huawei/health/sns/model/chat/AssistantMenu;->setxPosition(I)V

    .line 225
    sub-int v0, v4, v5

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/chat/AssistantMenu;->setyPosition(I)V

    .line 226
    const-string v0, "type"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v7, Lcom/huawei/health/sns/model/chat/AssistantMenu;->type:Ljava/lang/String;

    .line 227
    const-string v0, "name"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v7, Lcom/huawei/health/sns/model/chat/AssistantMenu;->name:Ljava/lang/String;

    .line 228
    const-string v0, "key"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v7, Lcom/huawei/health/sns/model/chat/AssistantMenu;->key:Ljava/lang/String;

    .line 229
    const-string v0, "url"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v7, Lcom/huawei/health/sns/model/chat/AssistantMenu;->url:Ljava/lang/String;

    .line 230
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 219
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 241
    :cond_1
    goto :goto_1

    .line 234
    :catch_0
    move-exception v4

    .line 236
    const-string v0, "AssistantMenu"

    const-string v1, "parseAssistSubMenu error,RuntimeException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    goto :goto_1

    .line 238
    :catch_1
    move-exception v4

    .line 240
    const-string v0, "AssistantMenu"

    const-string v1, "parseAssistSubMenu error,JSONException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    :goto_1
    return-object v2
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 113
    const/4 v0, 0x0

    return v0
.end method

.method public getKey()Ljava/lang/String;
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/AssistantMenu;->key:Ljava/lang/String;

    .line 91
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/AssistantMenu;->name:Ljava/lang/String;

    .line 85
    return-object v0
.end method

.method public getSub_button()Ljava/lang/String;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/AssistantMenu;->sub_button:Ljava/lang/String;

    .line 103
    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/AssistantMenu;->type:Ljava/lang/String;

    .line 79
    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/AssistantMenu;->url:Ljava/lang/String;

    .line 97
    return-object v0
.end method

.method public getxPosition()I
    .locals 1

    .line 247
    iget v0, p0, Lcom/huawei/health/sns/model/chat/AssistantMenu;->xPosition:I

    return v0
.end method

.method public getyPosition()I
    .locals 1

    .line 257
    iget v0, p0, Lcom/huawei/health/sns/model/chat/AssistantMenu;->yPosition:I

    return v0
.end method

.method public setxPosition(I)V
    .locals 0

    .line 252
    iput p1, p0, Lcom/huawei/health/sns/model/chat/AssistantMenu;->xPosition:I

    .line 253
    return-void
.end method

.method public setyPosition(I)V
    .locals 0

    .line 262
    iput p1, p0, Lcom/huawei/health/sns/model/chat/AssistantMenu;->yPosition:I

    .line 263
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/AssistantMenu;->type:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 120
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/AssistantMenu;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 121
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/AssistantMenu;->key:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 122
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/AssistantMenu;->url:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 123
    iget-object v0, p0, Lcom/huawei/health/sns/model/chat/AssistantMenu;->sub_button:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 124
    return-void
.end method
