.class public Lcom/huawei/health/sns/server/user/Origin;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/server/user/Origin;>;"
        }
    .end annotation
.end field

.field public static final FROM_CONTACT:I = 0x0

.field public static final FROM_FAMILY:I = 0x6

.field public static final FROM_GROUP_CHAT:I = 0x5

.field public static final FROM_SEARCH_ACCOUNT:I = 0x4

.field public static final FROM_SEARCH_CONTACT:I = 0x1

.field public static final FROM_THIRD_BUSINESS:I = 0x8

.field public static final FROM_THIRD_RECOM:I = 0x7

.field public static final FROM_TWODIM_CODE:I = 0x2

.field public static final FROM_UNKNOW:I = -0x1

.field public static final FROM_VCARD:I = 0x3

.field public static final bundleFrdKey:Ljava/lang/String; = "sns_frd_origin"

.field public static final bundleMyKey:Ljava/lang/String; = "sns_my_origin"


# instance fields
.field private desc_:Ljava/lang/String;

.field private type_:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 149
    new-instance v0, Lcom/huawei/health/sns/server/user/Origin$1;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/user/Origin$1;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/server/user/Origin;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 90
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 79
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/server/user/Origin;->type_:I

    .line 92
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 95
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 79
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/server/user/Origin;->type_:I

    .line 96
    iput p1, p0, Lcom/huawei/health/sns/server/user/Origin;->type_:I

    .line 97
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    .line 100
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 79
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/server/user/Origin;->type_:I

    .line 101
    iput p1, p0, Lcom/huawei/health/sns/server/user/Origin;->type_:I

    .line 102
    iput-object p2, p0, Lcom/huawei/health/sns/server/user/Origin;->desc_:Ljava/lang/String;

    .line 103
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 141
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 79
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/server/user/Origin;->type_:I

    .line 142
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/server/user/Origin;->type_:I

    .line 143
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/Origin;->desc_:Ljava/lang/String;

    .line 144
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/huawei/health/sns/server/user/Origin$1;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/server/user/Origin;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public static getStringByType(Landroid/content/Context;ILjava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 171
    const/4 v4, 0x0

    .line 172
    if-nez p0, :cond_0

    .line 174
    return-object v4

    .line 177
    :cond_0
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 180
    :pswitch_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_origin_contact:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 181
    goto :goto_0

    .line 183
    :pswitch_1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_origin_search_contact:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 184
    goto :goto_0

    .line 186
    :pswitch_2
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_origin_twodimcode:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 187
    goto :goto_0

    .line 189
    :pswitch_3
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_origin_vcard:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 190
    goto :goto_0

    .line 192
    :pswitch_4
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_add_friend_from:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 193
    goto :goto_0

    .line 195
    :pswitch_5
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_origin_groupchat:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 196
    goto :goto_0

    .line 198
    :pswitch_6
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_origin_family:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 199
    goto :goto_0

    .line 201
    :pswitch_7
    move-object v4, p2

    .line 202
    goto :goto_0

    .line 204
    :pswitch_8
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 206
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_origin_third_business:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 212
    :cond_1
    :goto_0
    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method

.method public static matchUserNotifyType(Lcom/huawei/health/sns/model/user/UserNotify;)[Lcom/huawei/health/sns/server/user/Origin;
    .locals 4

    .line 263
    const/4 v0, 0x2

    new-array v3, v0, [Lcom/huawei/health/sns/server/user/Origin;

    .line 264
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    if-nez v0, :cond_1

    .line 266
    :cond_0
    const-string v0, ""

    const-string v1, "match UserNotify is null."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 267
    return-object v3

    .line 269
    :cond_1
    const-string v0, ""

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "match UserNotify type:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->c:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-eq v0, v1, :cond_2

    .line 271
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->a:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-eq v0, v1, :cond_2

    .line 272
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->d:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-eq v0, v1, :cond_2

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->b:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-ne v0, v1, :cond_3

    .line 274
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/user/UserNotify;->getFrdOrigin()Lcom/huawei/health/sns/server/user/Origin;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v3, v1

    .line 275
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/user/UserNotify;->getMyOrigin()Lcom/huawei/health/sns/server/user/Origin;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v3, v1

    goto :goto_0

    .line 277
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->g:Lcom/huawei/health/sns/model/user/UserNotify$b;

    if-ne v0, v1, :cond_4

    .line 280
    new-instance v0, Lcom/huawei/health/sns/server/user/Origin;

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/user/UserNotify;->getNote()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x7

    invoke-direct {v0, v2, v1}, Lcom/huawei/health/sns/server/user/Origin;-><init>(ILjava/lang/String;)V

    const/4 v1, 0x0

    aput-object v0, v3, v1

    .line 281
    new-instance v0, Lcom/huawei/health/sns/server/user/Origin;

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/user/UserNotify;->getNote()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x7

    invoke-direct {v0, v2, v1}, Lcom/huawei/health/sns/server/user/Origin;-><init>(ILjava/lang/String;)V

    const/4 v1, 0x1

    aput-object v0, v3, v1

    .line 283
    :cond_4
    :goto_0
    return-object v3
.end method

.method public static obtainOriginByLocalType(Lcom/huawei/health/sns/server/user/Origin;)[Lcom/huawei/health/sns/server/user/Origin;
    .locals 4

    .line 226
    const/4 v0, 0x2

    new-array v3, v0, [Lcom/huawei/health/sns/server/user/Origin;

    .line 228
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/user/Origin;->getType_()I

    move-result v0

    const/4 v1, -0x1

    if-gt v0, v1, :cond_1

    .line 230
    :cond_0
    return-object v3

    .line 233
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/user/Origin;->getType_()I

    move-result v0

    if-nez v0, :cond_2

    .line 235
    new-instance v0, Lcom/huawei/health/sns/server/user/Origin;

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/user/Origin;->getDesc_()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lcom/huawei/health/sns/server/user/Origin;-><init>(ILjava/lang/String;)V

    const/4 v1, 0x0

    aput-object v0, v3, v1

    .line 236
    new-instance v0, Lcom/huawei/health/sns/server/user/Origin;

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/user/Origin;->getDesc_()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Lcom/huawei/health/sns/server/user/Origin;-><init>(ILjava/lang/String;)V

    const/4 v1, 0x1

    aput-object v0, v3, v1

    goto :goto_0

    .line 238
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/user/Origin;->getType_()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 241
    new-instance v0, Lcom/huawei/health/sns/server/user/Origin;

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/user/Origin;->getDesc_()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Lcom/huawei/health/sns/server/user/Origin;-><init>(ILjava/lang/String;)V

    const/4 v1, 0x0

    aput-object v0, v3, v1

    .line 242
    new-instance v0, Lcom/huawei/health/sns/server/user/Origin;

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/user/Origin;->getDesc_()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lcom/huawei/health/sns/server/user/Origin;-><init>(ILjava/lang/String;)V

    const/4 v1, 0x1

    aput-object v0, v3, v1

    goto :goto_0

    .line 244
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/user/Origin;->getType_()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_4

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/user/Origin;->getType_()I

    move-result v0

    const/16 v1, 0x8

    if-gt v0, v1, :cond_4

    .line 246
    new-instance v0, Lcom/huawei/health/sns/server/user/Origin;

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/user/Origin;->getType_()I

    move-result v1

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/user/Origin;->getDesc_()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/sns/server/user/Origin;-><init>(ILjava/lang/String;)V

    const/4 v1, 0x0

    aput-object v0, v3, v1

    .line 247
    new-instance v0, Lcom/huawei/health/sns/server/user/Origin;

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/user/Origin;->getType_()I

    move-result v1

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/user/Origin;->getDesc_()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/sns/server/user/Origin;-><init>(ILjava/lang/String;)V

    const/4 v1, 0x1

    aput-object v0, v3, v1

    .line 249
    :cond_4
    :goto_0
    return-object v3
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 130
    const/4 v0, 0x0

    return v0
.end method

.method public getDesc_()Ljava/lang/String;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/Origin;->desc_:Ljava/lang/String;

    .line 119
    return-object v0
.end method

.method public getType_()I
    .locals 1

    .line 107
    iget v0, p0, Lcom/huawei/health/sns/server/user/Origin;->type_:I

    .line 108
    return v0
.end method

.method public setDesc_(Ljava/lang/String;)V
    .locals 0

    .line 124
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/Origin;->desc_:Ljava/lang/String;

    .line 125
    return-void
.end method

.method public setType_(I)V
    .locals 0

    .line 113
    iput p1, p0, Lcom/huawei/health/sns/server/user/Origin;->type_:I

    .line 114
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 136
    iget v0, p0, Lcom/huawei/health/sns/server/user/Origin;->type_:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 137
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/Origin;->desc_:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 138
    return-void
.end method
