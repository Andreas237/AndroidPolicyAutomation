.class public final enum Lcom/ibotta/api/model/TaskModel$Type;
.super Ljava/lang/Enum;
.source "TaskModel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/TaskModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Type"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/TaskModel$Type;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum APP_TRAILER:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum DO_GOODER:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum FACT:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum GETTING_TO_KNOW_YOU:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum GUESS_THE_PRICE:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum G_PLUS:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum HOW_TO:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum INSTANT:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum INVITE:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum JOIN_THE_CLUB:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum JOIN_THE_CLUB_OPT:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum JOUST:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum LOGIC_SURVEY:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum MOVIE_REVIEW:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum MOVIE_TRAILER:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum NUTRITION:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum PINTEREST:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum POLL:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum POLL_MULTI:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum QUIZ:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum RECIPE:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum SEAL_OF_APPROVAL:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum SHOP_NOW:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum SOCIAL:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum STORE_LOCATOR:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum SURVEY:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum SWEEPSTAKES:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum TESTIFY:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum TWITTER:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum UNKNOWN:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum VIDEO:Lcom/ibotta/api/model/TaskModel$Type;

.field public static final enum VIDEO_AD:Lcom/ibotta/api/model/TaskModel$Type;


# instance fields
.field private final deprecated:Z

.field private final trackingName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 19
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "FACT"

    const-string v2, "Fact"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->FACT:Lcom/ibotta/api/model/TaskModel$Type;

    .line 20
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "POLL_MULTI"

    const-string v2, "Multiple Choice"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->POLL_MULTI:Lcom/ibotta/api/model/TaskModel$Type;

    .line 21
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "POLL"

    const-string v2, "Poll"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->POLL:Lcom/ibotta/api/model/TaskModel$Type;

    .line 22
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "SOCIAL"

    const-string v2, "Facebook"

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v2}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->SOCIAL:Lcom/ibotta/api/model/TaskModel$Type;

    .line 23
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "TWITTER"

    const-string v2, "Twitter"

    const/4 v7, 0x4

    invoke-direct {v0, v1, v7, v2}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->TWITTER:Lcom/ibotta/api/model/TaskModel$Type;

    .line 24
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "G_PLUS"

    const-string v2, "Google+"

    const/4 v8, 0x5

    invoke-direct {v0, v1, v8, v2}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->G_PLUS:Lcom/ibotta/api/model/TaskModel$Type;

    .line 25
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "VIDEO"

    const-string v2, "Video"

    const/4 v9, 0x6

    invoke-direct {v0, v1, v9, v2}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->VIDEO:Lcom/ibotta/api/model/TaskModel$Type;

    .line 26
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "MOVIE_TRAILER"

    const-string v2, "Movie Trailer"

    const/4 v10, 0x7

    invoke-direct {v0, v1, v10, v2}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->MOVIE_TRAILER:Lcom/ibotta/api/model/TaskModel$Type;

    .line 27
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "VIDEO_AD"

    const-string v2, "Video Ad"

    const/16 v11, 0x8

    invoke-direct {v0, v1, v11, v2}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->VIDEO_AD:Lcom/ibotta/api/model/TaskModel$Type;

    .line 28
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "APP_TRAILER"

    const-string v2, "App Trailer"

    const/16 v12, 0x9

    invoke-direct {v0, v1, v12, v2, v4}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->APP_TRAILER:Lcom/ibotta/api/model/TaskModel$Type;

    .line 29
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "RECIPE"

    const-string v2, "Recipe"

    const/16 v13, 0xa

    invoke-direct {v0, v1, v13, v2}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->RECIPE:Lcom/ibotta/api/model/TaskModel$Type;

    .line 30
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "QUIZ"

    const-string v2, "Quiz"

    const/16 v14, 0xb

    invoke-direct {v0, v1, v14, v2}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->QUIZ:Lcom/ibotta/api/model/TaskModel$Type;

    .line 31
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "HOW_TO"

    const-string v2, "How To"

    const/16 v15, 0xc

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->HOW_TO:Lcom/ibotta/api/model/TaskModel$Type;

    .line 32
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "DO_GOODER"

    const-string v2, "Do Gooder"

    const/16 v15, 0xd

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->DO_GOODER:Lcom/ibotta/api/model/TaskModel$Type;

    .line 33
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "SEAL_OF_APPROVAL"

    const-string v2, "Seal of Approval"

    const/16 v15, 0xe

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->SEAL_OF_APPROVAL:Lcom/ibotta/api/model/TaskModel$Type;

    .line 34
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "MOVIE_REVIEW"

    const-string v2, "Movie Review"

    const/16 v15, 0xf

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->MOVIE_REVIEW:Lcom/ibotta/api/model/TaskModel$Type;

    .line 35
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "NUTRITION"

    const-string v2, "Nutrition"

    const/16 v15, 0x10

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->NUTRITION:Lcom/ibotta/api/model/TaskModel$Type;

    .line 36
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "TESTIFY"

    const-string v2, "Testify"

    const/16 v15, 0x11

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->TESTIFY:Lcom/ibotta/api/model/TaskModel$Type;

    .line 37
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "INVITE"

    const-string v2, "Invite"

    const/16 v15, 0x12

    invoke-direct {v0, v1, v15, v2, v4}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->INVITE:Lcom/ibotta/api/model/TaskModel$Type;

    .line 38
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "STORE_LOCATOR"

    const-string v2, "Store Locator"

    const/16 v15, 0x13

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->STORE_LOCATOR:Lcom/ibotta/api/model/TaskModel$Type;

    .line 39
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "GUESS_THE_PRICE"

    const-string v2, "Guess the Price"

    const/16 v15, 0x14

    invoke-direct {v0, v1, v15, v2, v4}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->GUESS_THE_PRICE:Lcom/ibotta/api/model/TaskModel$Type;

    .line 40
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "JOUST"

    const-string v2, "Joust"

    const/16 v15, 0x15

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->JOUST:Lcom/ibotta/api/model/TaskModel$Type;

    .line 41
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "SWEEPSTAKES"

    const-string v2, "Sweepstakes"

    const/16 v15, 0x16

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->SWEEPSTAKES:Lcom/ibotta/api/model/TaskModel$Type;

    .line 42
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "GETTING_TO_KNOW_YOU"

    const-string v2, "Getting to Know You"

    const/16 v15, 0x17

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->GETTING_TO_KNOW_YOU:Lcom/ibotta/api/model/TaskModel$Type;

    .line 43
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "SURVEY"

    const-string v2, "Survey"

    const/16 v15, 0x18

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->SURVEY:Lcom/ibotta/api/model/TaskModel$Type;

    .line 44
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "PINTEREST"

    const-string v2, "Pinterest"

    const/16 v15, 0x19

    invoke-direct {v0, v1, v15, v2, v4}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->PINTEREST:Lcom/ibotta/api/model/TaskModel$Type;

    .line 45
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "JOIN_THE_CLUB"

    const-string v2, "Join the Club"

    const/16 v15, 0x1a

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->JOIN_THE_CLUB:Lcom/ibotta/api/model/TaskModel$Type;

    .line 46
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "JOIN_THE_CLUB_OPT"

    const-string v2, "Join the Club Opt"

    const/16 v15, 0x1b

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->JOIN_THE_CLUB_OPT:Lcom/ibotta/api/model/TaskModel$Type;

    .line 47
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "LOGIC_SURVEY"

    const-string v2, "Logic Survey"

    const/16 v15, 0x1c

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->LOGIC_SURVEY:Lcom/ibotta/api/model/TaskModel$Type;

    .line 48
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "INSTANT"

    const-string v2, "Instant Unlock"

    const/16 v15, 0x1d

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->INSTANT:Lcom/ibotta/api/model/TaskModel$Type;

    .line 49
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "SHOP_NOW"

    const-string v2, "Shop Now"

    const/16 v15, 0x1e

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->SHOP_NOW:Lcom/ibotta/api/model/TaskModel$Type;

    .line 50
    new-instance v0, Lcom/ibotta/api/model/TaskModel$Type;

    const-string v1, "UNKNOWN"

    const-string v2, "Unknown"

    const/16 v15, 0x1f

    invoke-direct {v0, v1, v15, v2}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->UNKNOWN:Lcom/ibotta/api/model/TaskModel$Type;

    const/16 v0, 0x20

    .line 18
    new-array v0, v0, [Lcom/ibotta/api/model/TaskModel$Type;

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->FACT:Lcom/ibotta/api/model/TaskModel$Type;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->POLL_MULTI:Lcom/ibotta/api/model/TaskModel$Type;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->POLL:Lcom/ibotta/api/model/TaskModel$Type;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->SOCIAL:Lcom/ibotta/api/model/TaskModel$Type;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->TWITTER:Lcom/ibotta/api/model/TaskModel$Type;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->G_PLUS:Lcom/ibotta/api/model/TaskModel$Type;

    aput-object v1, v0, v8

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->VIDEO:Lcom/ibotta/api/model/TaskModel$Type;

    aput-object v1, v0, v9

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->MOVIE_TRAILER:Lcom/ibotta/api/model/TaskModel$Type;

    aput-object v1, v0, v10

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->VIDEO_AD:Lcom/ibotta/api/model/TaskModel$Type;

    aput-object v1, v0, v11

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->APP_TRAILER:Lcom/ibotta/api/model/TaskModel$Type;

    aput-object v1, v0, v12

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->RECIPE:Lcom/ibotta/api/model/TaskModel$Type;

    aput-object v1, v0, v13

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->QUIZ:Lcom/ibotta/api/model/TaskModel$Type;

    aput-object v1, v0, v14

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->HOW_TO:Lcom/ibotta/api/model/TaskModel$Type;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->DO_GOODER:Lcom/ibotta/api/model/TaskModel$Type;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->SEAL_OF_APPROVAL:Lcom/ibotta/api/model/TaskModel$Type;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->MOVIE_REVIEW:Lcom/ibotta/api/model/TaskModel$Type;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->NUTRITION:Lcom/ibotta/api/model/TaskModel$Type;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->TESTIFY:Lcom/ibotta/api/model/TaskModel$Type;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->INVITE:Lcom/ibotta/api/model/TaskModel$Type;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->STORE_LOCATOR:Lcom/ibotta/api/model/TaskModel$Type;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->GUESS_THE_PRICE:Lcom/ibotta/api/model/TaskModel$Type;

    const/16 v2, 0x14

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->JOUST:Lcom/ibotta/api/model/TaskModel$Type;

    const/16 v2, 0x15

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->SWEEPSTAKES:Lcom/ibotta/api/model/TaskModel$Type;

    const/16 v2, 0x16

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->GETTING_TO_KNOW_YOU:Lcom/ibotta/api/model/TaskModel$Type;

    const/16 v2, 0x17

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->SURVEY:Lcom/ibotta/api/model/TaskModel$Type;

    const/16 v2, 0x18

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->PINTEREST:Lcom/ibotta/api/model/TaskModel$Type;

    const/16 v2, 0x19

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->JOIN_THE_CLUB:Lcom/ibotta/api/model/TaskModel$Type;

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->JOIN_THE_CLUB_OPT:Lcom/ibotta/api/model/TaskModel$Type;

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->LOGIC_SURVEY:Lcom/ibotta/api/model/TaskModel$Type;

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->INSTANT:Lcom/ibotta/api/model/TaskModel$Type;

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->SHOP_NOW:Lcom/ibotta/api/model/TaskModel$Type;

    const/16 v2, 0x1e

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/TaskModel$Type;->UNKNOWN:Lcom/ibotta/api/model/TaskModel$Type;

    const/16 v2, 0x1f

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/api/model/TaskModel$Type;->$VALUES:[Lcom/ibotta/api/model/TaskModel$Type;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 56
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/api/model/TaskModel$Type;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    .line 59
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 60
    iput-object p3, p0, Lcom/ibotta/api/model/TaskModel$Type;->trackingName:Ljava/lang/String;

    .line 61
    iput-boolean p4, p0, Lcom/ibotta/api/model/TaskModel$Type;->deprecated:Z

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/TaskModel$Type;
    .locals 0

    .line 75
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/api/model/TaskModel$Type;->valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/TaskModel$Type;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 78
    :catch_0
    sget-object p0, Lcom/ibotta/api/model/TaskModel$Type;->UNKNOWN:Lcom/ibotta/api/model/TaskModel$Type;

    :goto_0
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/TaskModel$Type;
    .locals 1

    .line 18
    const-class v0, Lcom/ibotta/api/model/TaskModel$Type;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/TaskModel$Type;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/TaskModel$Type;
    .locals 1

    .line 18
    sget-object v0, Lcom/ibotta/api/model/TaskModel$Type;->$VALUES:[Lcom/ibotta/api/model/TaskModel$Type;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/TaskModel$Type;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/TaskModel$Type;

    return-object v0
.end method


# virtual methods
.method public getTrackingName()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/ibotta/api/model/TaskModel$Type;->trackingName:Ljava/lang/String;

    return-object v0
.end method

.method public isInstantUnlock()Z
    .locals 1

    .line 69
    sget-object v0, Lcom/ibotta/api/model/TaskModel$Type;->INSTANT:Lcom/ibotta/api/model/TaskModel$Type;

    if-eq p0, v0, :cond_1

    iget-boolean v0, p0, Lcom/ibotta/api/model/TaskModel$Type;->deprecated:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
