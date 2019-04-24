.class public final enum Lio/branch/referral/Defines$RequestPath;
.super Ljava/lang/Enum;
.source "Defines.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/branch/referral/Defines;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "RequestPath"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/branch/referral/Defines$RequestPath;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/branch/referral/Defines$RequestPath;

.field public static final enum ApplyReferralCode:Lio/branch/referral/Defines$RequestPath;

.field public static final enum CompletedAction:Lio/branch/referral/Defines$RequestPath;

.field public static final enum ContentEvent:Lio/branch/referral/Defines$RequestPath;

.field public static final enum DebugConnect:Lio/branch/referral/Defines$RequestPath;

.field public static final enum GetApp:Lio/branch/referral/Defines$RequestPath;

.field public static final enum GetCreditHistory:Lio/branch/referral/Defines$RequestPath;

.field public static final enum GetCredits:Lio/branch/referral/Defines$RequestPath;

.field public static final enum GetReferralCode:Lio/branch/referral/Defines$RequestPath;

.field public static final enum GetURL:Lio/branch/referral/Defines$RequestPath;

.field public static final enum IdentifyUser:Lio/branch/referral/Defines$RequestPath;

.field public static final enum Logout:Lio/branch/referral/Defines$RequestPath;

.field public static final enum RedeemRewards:Lio/branch/referral/Defines$RequestPath;

.field public static final enum RegisterClose:Lio/branch/referral/Defines$RequestPath;

.field public static final enum RegisterInstall:Lio/branch/referral/Defines$RequestPath;

.field public static final enum RegisterOpen:Lio/branch/referral/Defines$RequestPath;

.field public static final enum RegisterView:Lio/branch/referral/Defines$RequestPath;

.field public static final enum TrackCustomEvent:Lio/branch/referral/Defines$RequestPath;

.field public static final enum TrackStandardEvent:Lio/branch/referral/Defines$RequestPath;

.field public static final enum ValidateReferralCode:Lio/branch/referral/Defines$RequestPath;


# instance fields
.field private key:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 211
    new-instance v0, Lio/branch/referral/Defines$RequestPath;

    const-string v1, "RedeemRewards"

    const-string/jumbo v2, "v1/redeem"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lio/branch/referral/Defines$RequestPath;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/Defines$RequestPath;->RedeemRewards:Lio/branch/referral/Defines$RequestPath;

    .line 212
    new-instance v0, Lio/branch/referral/Defines$RequestPath;

    const-string v1, "GetURL"

    const-string/jumbo v2, "v1/url"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lio/branch/referral/Defines$RequestPath;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/Defines$RequestPath;->GetURL:Lio/branch/referral/Defines$RequestPath;

    .line 213
    new-instance v0, Lio/branch/referral/Defines$RequestPath;

    const-string v1, "GetApp"

    const-string/jumbo v2, "v1/app-link-settings"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lio/branch/referral/Defines$RequestPath;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/Defines$RequestPath;->GetApp:Lio/branch/referral/Defines$RequestPath;

    .line 214
    new-instance v0, Lio/branch/referral/Defines$RequestPath;

    const-string v1, "RegisterInstall"

    const-string/jumbo v2, "v1/install"

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v2}, Lio/branch/referral/Defines$RequestPath;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/Defines$RequestPath;->RegisterInstall:Lio/branch/referral/Defines$RequestPath;

    .line 215
    new-instance v0, Lio/branch/referral/Defines$RequestPath;

    const-string v1, "RegisterClose"

    const-string/jumbo v2, "v1/close"

    const/4 v7, 0x4

    invoke-direct {v0, v1, v7, v2}, Lio/branch/referral/Defines$RequestPath;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/Defines$RequestPath;->RegisterClose:Lio/branch/referral/Defines$RequestPath;

    .line 216
    new-instance v0, Lio/branch/referral/Defines$RequestPath;

    const-string v1, "RegisterOpen"

    const-string/jumbo v2, "v1/open"

    const/4 v8, 0x5

    invoke-direct {v0, v1, v8, v2}, Lio/branch/referral/Defines$RequestPath;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/Defines$RequestPath;->RegisterOpen:Lio/branch/referral/Defines$RequestPath;

    .line 217
    new-instance v0, Lio/branch/referral/Defines$RequestPath;

    const-string v1, "RegisterView"

    const-string/jumbo v2, "v1/register-view"

    const/4 v9, 0x6

    invoke-direct {v0, v1, v9, v2}, Lio/branch/referral/Defines$RequestPath;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/Defines$RequestPath;->RegisterView:Lio/branch/referral/Defines$RequestPath;

    .line 218
    new-instance v0, Lio/branch/referral/Defines$RequestPath;

    const-string v1, "GetCredits"

    const-string/jumbo v2, "v1/credits/"

    const/4 v10, 0x7

    invoke-direct {v0, v1, v10, v2}, Lio/branch/referral/Defines$RequestPath;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/Defines$RequestPath;->GetCredits:Lio/branch/referral/Defines$RequestPath;

    .line 219
    new-instance v0, Lio/branch/referral/Defines$RequestPath;

    const-string v1, "GetCreditHistory"

    const-string/jumbo v2, "v1/credithistory"

    const/16 v11, 0x8

    invoke-direct {v0, v1, v11, v2}, Lio/branch/referral/Defines$RequestPath;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/Defines$RequestPath;->GetCreditHistory:Lio/branch/referral/Defines$RequestPath;

    .line 220
    new-instance v0, Lio/branch/referral/Defines$RequestPath;

    const-string v1, "CompletedAction"

    const-string/jumbo v2, "v1/event"

    const/16 v12, 0x9

    invoke-direct {v0, v1, v12, v2}, Lio/branch/referral/Defines$RequestPath;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/Defines$RequestPath;->CompletedAction:Lio/branch/referral/Defines$RequestPath;

    .line 221
    new-instance v0, Lio/branch/referral/Defines$RequestPath;

    const-string v1, "IdentifyUser"

    const-string/jumbo v2, "v1/profile"

    const/16 v13, 0xa

    invoke-direct {v0, v1, v13, v2}, Lio/branch/referral/Defines$RequestPath;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/Defines$RequestPath;->IdentifyUser:Lio/branch/referral/Defines$RequestPath;

    .line 222
    new-instance v0, Lio/branch/referral/Defines$RequestPath;

    const-string v1, "Logout"

    const-string/jumbo v2, "v1/logout"

    const/16 v14, 0xb

    invoke-direct {v0, v1, v14, v2}, Lio/branch/referral/Defines$RequestPath;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/Defines$RequestPath;->Logout:Lio/branch/referral/Defines$RequestPath;

    .line 223
    new-instance v0, Lio/branch/referral/Defines$RequestPath;

    const-string v1, "GetReferralCode"

    const-string/jumbo v2, "v1/referralcode"

    const/16 v15, 0xc

    invoke-direct {v0, v1, v15, v2}, Lio/branch/referral/Defines$RequestPath;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/Defines$RequestPath;->GetReferralCode:Lio/branch/referral/Defines$RequestPath;

    .line 224
    new-instance v0, Lio/branch/referral/Defines$RequestPath;

    const-string v1, "ValidateReferralCode"

    const-string/jumbo v2, "v1/referralcode/"

    const/16 v15, 0xd

    invoke-direct {v0, v1, v15, v2}, Lio/branch/referral/Defines$RequestPath;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/Defines$RequestPath;->ValidateReferralCode:Lio/branch/referral/Defines$RequestPath;

    .line 225
    new-instance v0, Lio/branch/referral/Defines$RequestPath;

    const-string v1, "ApplyReferralCode"

    const-string/jumbo v2, "v1/applycode/"

    const/16 v15, 0xe

    invoke-direct {v0, v1, v15, v2}, Lio/branch/referral/Defines$RequestPath;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/Defines$RequestPath;->ApplyReferralCode:Lio/branch/referral/Defines$RequestPath;

    .line 226
    new-instance v0, Lio/branch/referral/Defines$RequestPath;

    const-string v1, "DebugConnect"

    const-string/jumbo v2, "v1/debug/connect"

    const/16 v15, 0xf

    invoke-direct {v0, v1, v15, v2}, Lio/branch/referral/Defines$RequestPath;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/Defines$RequestPath;->DebugConnect:Lio/branch/referral/Defines$RequestPath;

    .line 227
    new-instance v0, Lio/branch/referral/Defines$RequestPath;

    const-string v1, "ContentEvent"

    const-string/jumbo v2, "v1/content-events"

    const/16 v15, 0x10

    invoke-direct {v0, v1, v15, v2}, Lio/branch/referral/Defines$RequestPath;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/Defines$RequestPath;->ContentEvent:Lio/branch/referral/Defines$RequestPath;

    .line 228
    new-instance v0, Lio/branch/referral/Defines$RequestPath;

    const-string v1, "TrackStandardEvent"

    const-string/jumbo v2, "v2/event/standard"

    const/16 v15, 0x11

    invoke-direct {v0, v1, v15, v2}, Lio/branch/referral/Defines$RequestPath;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/Defines$RequestPath;->TrackStandardEvent:Lio/branch/referral/Defines$RequestPath;

    .line 229
    new-instance v0, Lio/branch/referral/Defines$RequestPath;

    const-string v1, "TrackCustomEvent"

    const-string/jumbo v2, "v2/event/custom"

    const/16 v15, 0x12

    invoke-direct {v0, v1, v15, v2}, Lio/branch/referral/Defines$RequestPath;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/Defines$RequestPath;->TrackCustomEvent:Lio/branch/referral/Defines$RequestPath;

    const/16 v0, 0x13

    .line 210
    new-array v0, v0, [Lio/branch/referral/Defines$RequestPath;

    sget-object v1, Lio/branch/referral/Defines$RequestPath;->RedeemRewards:Lio/branch/referral/Defines$RequestPath;

    aput-object v1, v0, v3

    sget-object v1, Lio/branch/referral/Defines$RequestPath;->GetURL:Lio/branch/referral/Defines$RequestPath;

    aput-object v1, v0, v4

    sget-object v1, Lio/branch/referral/Defines$RequestPath;->GetApp:Lio/branch/referral/Defines$RequestPath;

    aput-object v1, v0, v5

    sget-object v1, Lio/branch/referral/Defines$RequestPath;->RegisterInstall:Lio/branch/referral/Defines$RequestPath;

    aput-object v1, v0, v6

    sget-object v1, Lio/branch/referral/Defines$RequestPath;->RegisterClose:Lio/branch/referral/Defines$RequestPath;

    aput-object v1, v0, v7

    sget-object v1, Lio/branch/referral/Defines$RequestPath;->RegisterOpen:Lio/branch/referral/Defines$RequestPath;

    aput-object v1, v0, v8

    sget-object v1, Lio/branch/referral/Defines$RequestPath;->RegisterView:Lio/branch/referral/Defines$RequestPath;

    aput-object v1, v0, v9

    sget-object v1, Lio/branch/referral/Defines$RequestPath;->GetCredits:Lio/branch/referral/Defines$RequestPath;

    aput-object v1, v0, v10

    sget-object v1, Lio/branch/referral/Defines$RequestPath;->GetCreditHistory:Lio/branch/referral/Defines$RequestPath;

    aput-object v1, v0, v11

    sget-object v1, Lio/branch/referral/Defines$RequestPath;->CompletedAction:Lio/branch/referral/Defines$RequestPath;

    aput-object v1, v0, v12

    sget-object v1, Lio/branch/referral/Defines$RequestPath;->IdentifyUser:Lio/branch/referral/Defines$RequestPath;

    aput-object v1, v0, v13

    sget-object v1, Lio/branch/referral/Defines$RequestPath;->Logout:Lio/branch/referral/Defines$RequestPath;

    aput-object v1, v0, v14

    sget-object v1, Lio/branch/referral/Defines$RequestPath;->GetReferralCode:Lio/branch/referral/Defines$RequestPath;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lio/branch/referral/Defines$RequestPath;->ValidateReferralCode:Lio/branch/referral/Defines$RequestPath;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lio/branch/referral/Defines$RequestPath;->ApplyReferralCode:Lio/branch/referral/Defines$RequestPath;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lio/branch/referral/Defines$RequestPath;->DebugConnect:Lio/branch/referral/Defines$RequestPath;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lio/branch/referral/Defines$RequestPath;->ContentEvent:Lio/branch/referral/Defines$RequestPath;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lio/branch/referral/Defines$RequestPath;->TrackStandardEvent:Lio/branch/referral/Defines$RequestPath;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lio/branch/referral/Defines$RequestPath;->TrackCustomEvent:Lio/branch/referral/Defines$RequestPath;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sput-object v0, Lio/branch/referral/Defines$RequestPath;->$VALUES:[Lio/branch/referral/Defines$RequestPath;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 233
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    const-string p1, ""

    .line 231
    iput-object p1, p0, Lio/branch/referral/Defines$RequestPath;->key:Ljava/lang/String;

    .line 234
    iput-object p3, p0, Lio/branch/referral/Defines$RequestPath;->key:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/branch/referral/Defines$RequestPath;
    .locals 1

    .line 210
    const-class v0, Lio/branch/referral/Defines$RequestPath;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/branch/referral/Defines$RequestPath;

    return-object p0
.end method

.method public static values()[Lio/branch/referral/Defines$RequestPath;
    .locals 1

    .line 210
    sget-object v0, Lio/branch/referral/Defines$RequestPath;->$VALUES:[Lio/branch/referral/Defines$RequestPath;

    invoke-virtual {v0}, [Lio/branch/referral/Defines$RequestPath;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/branch/referral/Defines$RequestPath;

    return-object v0
.end method


# virtual methods
.method public getPath()Ljava/lang/String;
    .locals 1

    .line 238
    iget-object v0, p0, Lio/branch/referral/Defines$RequestPath;->key:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 243
    iget-object v0, p0, Lio/branch/referral/Defines$RequestPath;->key:Ljava/lang/String;

    return-object v0
.end method
