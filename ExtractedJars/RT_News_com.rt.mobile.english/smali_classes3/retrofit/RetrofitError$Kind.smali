.class public final enum Lretrofit/RetrofitError$Kind;
.super Ljava/lang/Enum;
.source "RetrofitError.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lretrofit/RetrofitError;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Kind"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lretrofit/RetrofitError$Kind;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lretrofit/RetrofitError$Kind;

.field public static final enum CONVERSION:Lretrofit/RetrofitError$Kind;

.field public static final enum HTTP:Lretrofit/RetrofitError$Kind;

.field public static final enum NETWORK:Lretrofit/RetrofitError$Kind;

.field public static final enum UNEXPECTED:Lretrofit/RetrofitError$Kind;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 51
    new-instance v0, Lretrofit/RetrofitError$Kind;

    const-string v1, "NETWORK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lretrofit/RetrofitError$Kind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lretrofit/RetrofitError$Kind;->NETWORK:Lretrofit/RetrofitError$Kind;

    .line 53
    new-instance v0, Lretrofit/RetrofitError$Kind;

    const-string v1, "CONVERSION"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lretrofit/RetrofitError$Kind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lretrofit/RetrofitError$Kind;->CONVERSION:Lretrofit/RetrofitError$Kind;

    .line 55
    new-instance v0, Lretrofit/RetrofitError$Kind;

    const-string v1, "HTTP"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lretrofit/RetrofitError$Kind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lretrofit/RetrofitError$Kind;->HTTP:Lretrofit/RetrofitError$Kind;

    .line 60
    new-instance v0, Lretrofit/RetrofitError$Kind;

    const-string v1, "UNEXPECTED"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lretrofit/RetrofitError$Kind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lretrofit/RetrofitError$Kind;->UNEXPECTED:Lretrofit/RetrofitError$Kind;

    const/4 v0, 0x4

    .line 49
    new-array v0, v0, [Lretrofit/RetrofitError$Kind;

    sget-object v1, Lretrofit/RetrofitError$Kind;->NETWORK:Lretrofit/RetrofitError$Kind;

    aput-object v1, v0, v2

    sget-object v1, Lretrofit/RetrofitError$Kind;->CONVERSION:Lretrofit/RetrofitError$Kind;

    aput-object v1, v0, v3

    sget-object v1, Lretrofit/RetrofitError$Kind;->HTTP:Lretrofit/RetrofitError$Kind;

    aput-object v1, v0, v4

    sget-object v1, Lretrofit/RetrofitError$Kind;->UNEXPECTED:Lretrofit/RetrofitError$Kind;

    aput-object v1, v0, v5

    sput-object v0, Lretrofit/RetrofitError$Kind;->$VALUES:[Lretrofit/RetrofitError$Kind;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 49
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lretrofit/RetrofitError$Kind;
    .locals 1

    .line 49
    const-class v0, Lretrofit/RetrofitError$Kind;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lretrofit/RetrofitError$Kind;

    return-object p0
.end method

.method public static values()[Lretrofit/RetrofitError$Kind;
    .locals 1

    .line 49
    sget-object v0, Lretrofit/RetrofitError$Kind;->$VALUES:[Lretrofit/RetrofitError$Kind;

    invoke-virtual {v0}, [Lretrofit/RetrofitError$Kind;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lretrofit/RetrofitError$Kind;

    return-object v0
.end method
