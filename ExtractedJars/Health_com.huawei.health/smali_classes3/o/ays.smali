.class public Lo/ays;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:[C

.field private static b:Ljava/security/SecureRandom;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    sput-object v0, Lo/ays;->b:Ljava/security/SecureRandom;

    .line 25
    const-string v0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Lo/ays;->a:[C

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ljava/lang/String;
    .locals 5

    .line 35
    const/16 v0, 0x20

    new-array v3, v0, [C

    .line 36
    const/4 v4, 0x0

    :goto_0
    array-length v0, v3

    const/16 v0, 0x20

    if-ge v4, v0, :cond_0

    .line 38
    sget-object v0, Lo/ays;->a:[C

    sget-object v1, Lo/ays;->b:Ljava/security/SecureRandom;

    sget-object v2, Lo/ays;->a:[C

    array-length v2, v2

    invoke-virtual {v1, v2}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v1

    aget-char v0, v0, v1

    aput-char v0, v3, v4

    .line 36
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 40
    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method
