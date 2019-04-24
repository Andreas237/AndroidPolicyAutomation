.class public Lcom/usebutton/sdk/internal/models/AuthChallenge;
.super Ljava/lang/Object;
.source "AuthChallenge.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final AUTH_TYPE_OAUTH2:Ljava/lang/String; = "oauth2"

.field public static final AUTH_TYPE_SSO:Ljava/lang/String; = "sso"

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/usebutton/sdk/internal/models/AuthChallenge;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final mAccessDeniedText:Lcom/usebutton/sdk/internal/models/Text;

.field private final mAuthProcessingText:Lcom/usebutton/sdk/internal/models/Text;

.field private final mAuthProcessingUrl:Ljava/lang/String;

.field private final mAuthResultQueryKey:Ljava/lang/String;

.field private final mAuthResultUrl:Ljava/lang/String;

.field private final mAuthUrl:Ljava/lang/String;

.field private final mCustomizationScript:Ljava/lang/String;

.field private final mGeneralErrorText:Lcom/usebutton/sdk/internal/models/Text;

.field private final mPostbackUrl:Ljava/lang/String;

.field private final mType:Ljava/lang/String;

.field private final mWebViewLoadingText:Lcom/usebutton/sdk/internal/models/Text;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 257
    new-instance v0, Lcom/usebutton/sdk/internal/models/AuthChallenge$1;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/models/AuthChallenge$1;-><init>()V

    sput-object v0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 243
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 244
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mType:Ljava/lang/String;

    .line 245
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthUrl:Ljava/lang/String;

    .line 246
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mPostbackUrl:Ljava/lang/String;

    .line 247
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthProcessingUrl:Ljava/lang/String;

    .line 248
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthResultUrl:Ljava/lang/String;

    .line 249
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthResultQueryKey:Ljava/lang/String;

    .line 250
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mCustomizationScript:Ljava/lang/String;

    .line 251
    const-class v0, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Text;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mGeneralErrorText:Lcom/usebutton/sdk/internal/models/Text;

    .line 252
    const-class v0, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Text;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mWebViewLoadingText:Lcom/usebutton/sdk/internal/models/Text;

    .line 253
    const-class v0, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Text;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAccessDeniedText:Lcom/usebutton/sdk/internal/models/Text;

    .line 254
    const-class v0, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/internal/models/Text;

    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthProcessingText:Lcom/usebutton/sdk/internal/models/Text;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mType:Ljava/lang/String;

    .line 39
    iput-object p2, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthUrl:Ljava/lang/String;

    .line 40
    iput-object p3, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mPostbackUrl:Ljava/lang/String;

    .line 41
    iput-object p4, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthProcessingUrl:Ljava/lang/String;

    .line 42
    iput-object p5, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthResultUrl:Ljava/lang/String;

    .line 43
    iput-object p6, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthResultQueryKey:Ljava/lang/String;

    .line 44
    iput-object p7, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mCustomizationScript:Ljava/lang/String;

    .line 45
    iput-object p8, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mGeneralErrorText:Lcom/usebutton/sdk/internal/models/Text;

    .line 46
    iput-object p9, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mWebViewLoadingText:Lcom/usebutton/sdk/internal/models/Text;

    .line 47
    iput-object p10, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAccessDeniedText:Lcom/usebutton/sdk/internal/models/Text;

    .line 48
    iput-object p11, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthProcessingText:Lcom/usebutton/sdk/internal/models/Text;

    return-void
.end method

.method public static fromDTO(Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;)Lcom/usebutton/sdk/internal/models/AuthChallenge;
    .locals 13
    .param p0    # Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 57
    :cond_0
    new-instance v12, Lcom/usebutton/sdk/internal/models/AuthChallenge;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;->mType:Ljava/lang/String;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;->mAuthUrl:Ljava/lang/String;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;->mPostbackUrl:Ljava/lang/String;

    iget-object v4, p0, Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;->mAuthProcessingUrl:Ljava/lang/String;

    iget-object v5, p0, Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;->mAuthResultUrl:Ljava/lang/String;

    iget-object v6, p0, Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;->mAuthResultQueryKey:Ljava/lang/String;

    iget-object v7, p0, Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;->mCustomizationScript:Ljava/lang/String;

    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;->mGeneralErrorText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 64
    invoke-static {v0}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v8

    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;->mWebViewLoadingText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 65
    invoke-static {v0}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v9

    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;->mAccessDeniedText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 66
    invoke-static {v0}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v10

    iget-object p0, p0, Lcom/usebutton/sdk/internal/api/models/AuthChallengeDTO;->mAuthProcessingText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 67
    invoke-static {p0}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v11

    move-object v0, v12

    invoke-direct/range {v0 .. v11}, Lcom/usebutton/sdk/internal/models/AuthChallenge;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;)V

    return-object v12
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_18

    .line 143
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_b

    .line 147
    :cond_1
    check-cast p1, Lcom/usebutton/sdk/internal/models/AuthChallenge;

    .line 149
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mType:Ljava/lang/String;

    if-eqz v2, :cond_2

    iget-object v3, p1, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mType:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_2
    iget-object v2, p1, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mType:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_0
    return v1

    .line 152
    :cond_3
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthUrl:Ljava/lang/String;

    if-eqz v2, :cond_4

    iget-object v3, p1, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthUrl:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_1

    :cond_4
    iget-object v2, p1, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthUrl:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_1
    return v1

    .line 155
    :cond_5
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mPostbackUrl:Ljava/lang/String;

    if-eqz v2, :cond_6

    iget-object v3, p1, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mPostbackUrl:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_2

    :cond_6
    iget-object v2, p1, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mPostbackUrl:Ljava/lang/String;

    if-eqz v2, :cond_7

    :goto_2
    return v1

    .line 158
    :cond_7
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthProcessingUrl:Ljava/lang/String;

    if-eqz v2, :cond_8

    iget-object v3, p1, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthProcessingUrl:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_3

    :cond_8
    iget-object v2, p1, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthProcessingUrl:Ljava/lang/String;

    if-eqz v2, :cond_9

    :goto_3
    return v1

    .line 162
    :cond_9
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthResultUrl:Ljava/lang/String;

    if-eqz v2, :cond_a

    iget-object v3, p1, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthResultUrl:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    goto :goto_4

    :cond_a
    iget-object v2, p1, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthResultUrl:Ljava/lang/String;

    if-eqz v2, :cond_b

    :goto_4
    return v1

    .line 166
    :cond_b
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthResultQueryKey:Ljava/lang/String;

    if-eqz v2, :cond_c

    iget-object v3, p1, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthResultQueryKey:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    goto :goto_5

    :cond_c
    iget-object v2, p1, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthResultQueryKey:Ljava/lang/String;

    if-eqz v2, :cond_d

    :goto_5
    return v1

    .line 170
    :cond_d
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mCustomizationScript:Ljava/lang/String;

    if-eqz v2, :cond_e

    iget-object v3, p1, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mCustomizationScript:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    goto :goto_6

    :cond_e
    iget-object v2, p1, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mCustomizationScript:Ljava/lang/String;

    if-eqz v2, :cond_f

    :goto_6
    return v1

    .line 174
    :cond_f
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mGeneralErrorText:Lcom/usebutton/sdk/internal/models/Text;

    if-eqz v2, :cond_10

    iget-object v3, p1, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mGeneralErrorText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v2, v3}, Lcom/usebutton/sdk/internal/models/Text;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    goto :goto_7

    :cond_10
    iget-object v2, p1, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mGeneralErrorText:Lcom/usebutton/sdk/internal/models/Text;

    if-eqz v2, :cond_11

    :goto_7
    return v1

    .line 178
    :cond_11
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mWebViewLoadingText:Lcom/usebutton/sdk/internal/models/Text;

    if-eqz v2, :cond_12

    iget-object v3, p1, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mWebViewLoadingText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v2, v3}, Lcom/usebutton/sdk/internal/models/Text;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    goto :goto_8

    :cond_12
    iget-object v2, p1, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mWebViewLoadingText:Lcom/usebutton/sdk/internal/models/Text;

    if-eqz v2, :cond_13

    :goto_8
    return v1

    .line 182
    :cond_13
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAccessDeniedText:Lcom/usebutton/sdk/internal/models/Text;

    if-eqz v2, :cond_14

    iget-object v3, p1, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAccessDeniedText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v2, v3}, Lcom/usebutton/sdk/internal/models/Text;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    goto :goto_9

    :cond_14
    iget-object v2, p1, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAccessDeniedText:Lcom/usebutton/sdk/internal/models/Text;

    if-eqz v2, :cond_15

    :goto_9
    return v1

    .line 186
    :cond_15
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthProcessingText:Lcom/usebutton/sdk/internal/models/Text;

    if-eqz v2, :cond_16

    iget-object p1, p1, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthProcessingText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v2, p1}, Lcom/usebutton/sdk/internal/models/Text;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_a

    :cond_16
    iget-object p1, p1, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthProcessingText:Lcom/usebutton/sdk/internal/models/Text;

    if-nez p1, :cond_17

    goto :goto_a

    :cond_17
    move v0, v1

    :goto_a
    return v0

    :cond_18
    :goto_b
    return v1
.end method

.method public getAccessDeniedText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAccessDeniedText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getAuthProcessingText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthProcessingText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getAuthProcessingUrl()Ljava/lang/String;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthProcessingUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getAuthResultQueryKey()Ljava/lang/String;
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthResultQueryKey:Ljava/lang/String;

    return-object v0
.end method

.method public getAuthResultUrl()Ljava/lang/String;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthResultUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getAuthUrl()Ljava/lang/String;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getGeneralErrorText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mGeneralErrorText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getPostbackUrl()Ljava/lang/String;
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mPostbackUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mType:Ljava/lang/String;

    return-object v0
.end method

.method public getWebViewCustomizationScript()Ljava/lang/String;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mCustomizationScript:Ljava/lang/String;

    return-object v0
.end method

.method public getWebViewLoadingText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mWebViewLoadingText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 192
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mType:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 193
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthUrl:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 194
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mPostbackUrl:Ljava/lang/String;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_2
    move v2, v1

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 195
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthProcessingUrl:Ljava/lang/String;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_3

    :cond_3
    move v2, v1

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 196
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthResultUrl:Ljava/lang/String;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_4

    :cond_4
    move v2, v1

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 197
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthResultQueryKey:Ljava/lang/String;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_5

    :cond_5
    move v2, v1

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 198
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mCustomizationScript:Ljava/lang/String;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_6

    :cond_6
    move v2, v1

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 199
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mGeneralErrorText:Lcom/usebutton/sdk/internal/models/Text;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/Text;->hashCode()I

    move-result v2

    goto :goto_7

    :cond_7
    move v2, v1

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 200
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mWebViewLoadingText:Lcom/usebutton/sdk/internal/models/Text;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/Text;->hashCode()I

    move-result v2

    goto :goto_8

    :cond_8
    move v2, v1

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 201
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAccessDeniedText:Lcom/usebutton/sdk/internal/models/Text;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/Text;->hashCode()I

    move-result v2

    goto :goto_9

    :cond_9
    move v2, v1

    :goto_9
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 202
    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthProcessingText:Lcom/usebutton/sdk/internal/models/Text;

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/Text;->hashCode()I

    move-result v1

    :cond_a
    add-int/2addr v0, v1

    return v0
.end method

.method public isOAuth2Type()Z
    .locals 2

    const-string v0, "oauth2"

    .line 85
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/models/AuthChallenge;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isSSOType()Z
    .locals 2

    const-string/jumbo v0, "sso"

    .line 76
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/models/AuthChallenge;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 208
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AuthChallenge{mType=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", mAuthUrl=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthUrl:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", mPostbackUrl=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mPostbackUrl:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", mAuthProcessingUrl=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthProcessingUrl:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", mAuthResultUrl=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthResultUrl:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", mAuthResultQueryKey=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthResultQueryKey:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", mCustomizationScript=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mCustomizationScript:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", mGeneralErrorText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mGeneralErrorText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mWebViewLoadingText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mWebViewLoadingText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mAccessDeniedText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAccessDeniedText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mAuthProcessingText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthProcessingText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 230
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mType:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 231
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 232
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mPostbackUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 233
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthProcessingUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 234
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthResultUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 235
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthResultQueryKey:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 236
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mCustomizationScript:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 237
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mGeneralErrorText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 238
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mWebViewLoadingText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 239
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAccessDeniedText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 240
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/AuthChallenge;->mAuthProcessingText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
