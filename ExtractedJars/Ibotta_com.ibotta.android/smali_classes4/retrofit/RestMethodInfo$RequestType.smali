.class final enum Lretrofit/RestMethodInfo$RequestType;
.super Ljava/lang/Enum;
.source "RestMethodInfo.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lretrofit/RestMethodInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "RequestType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lretrofit/RestMethodInfo$RequestType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lretrofit/RestMethodInfo$RequestType;

.field public static final enum FORM_URL_ENCODED:Lretrofit/RestMethodInfo$RequestType;

.field public static final enum MULTIPART:Lretrofit/RestMethodInfo$RequestType;

.field public static final enum SIMPLE:Lretrofit/RestMethodInfo$RequestType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 66
    new-instance v0, Lretrofit/RestMethodInfo$RequestType;

    const-string v1, "SIMPLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lretrofit/RestMethodInfo$RequestType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lretrofit/RestMethodInfo$RequestType;->SIMPLE:Lretrofit/RestMethodInfo$RequestType;

    .line 68
    new-instance v0, Lretrofit/RestMethodInfo$RequestType;

    const-string v1, "MULTIPART"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lretrofit/RestMethodInfo$RequestType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lretrofit/RestMethodInfo$RequestType;->MULTIPART:Lretrofit/RestMethodInfo$RequestType;

    .line 70
    new-instance v0, Lretrofit/RestMethodInfo$RequestType;

    const-string v1, "FORM_URL_ENCODED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lretrofit/RestMethodInfo$RequestType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lretrofit/RestMethodInfo$RequestType;->FORM_URL_ENCODED:Lretrofit/RestMethodInfo$RequestType;

    const/4 v0, 0x3

    .line 64
    new-array v0, v0, [Lretrofit/RestMethodInfo$RequestType;

    sget-object v1, Lretrofit/RestMethodInfo$RequestType;->SIMPLE:Lretrofit/RestMethodInfo$RequestType;

    aput-object v1, v0, v2

    sget-object v1, Lretrofit/RestMethodInfo$RequestType;->MULTIPART:Lretrofit/RestMethodInfo$RequestType;

    aput-object v1, v0, v3

    sget-object v1, Lretrofit/RestMethodInfo$RequestType;->FORM_URL_ENCODED:Lretrofit/RestMethodInfo$RequestType;

    aput-object v1, v0, v4

    sput-object v0, Lretrofit/RestMethodInfo$RequestType;->$VALUES:[Lretrofit/RestMethodInfo$RequestType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 64
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lretrofit/RestMethodInfo$RequestType;
    .locals 1

    .line 64
    const-class v0, Lretrofit/RestMethodInfo$RequestType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lretrofit/RestMethodInfo$RequestType;

    return-object p0
.end method

.method public static values()[Lretrofit/RestMethodInfo$RequestType;
    .locals 1

    .line 64
    sget-object v0, Lretrofit/RestMethodInfo$RequestType;->$VALUES:[Lretrofit/RestMethodInfo$RequestType;

    invoke-virtual {v0}, [Lretrofit/RestMethodInfo$RequestType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lretrofit/RestMethodInfo$RequestType;

    return-object v0
.end method
