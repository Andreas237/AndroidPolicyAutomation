.class public final Lcom/newrelic/mobile/fbs/Platform;
.super Ljava/lang/Object;
.source "Platform.java"


# static fields
.field public static final Android:B = 0x0t

.field public static final iOS:B = 0x1t

.field public static final names:[Ljava/lang/String;

.field public static final tvOS:B = 0x2t


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "Android"

    const-string v1, "iOS"

    const-string v2, "tvOS"

    .line 11
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/newrelic/mobile/fbs/Platform;->names:[Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static name(I)Ljava/lang/String;
    .locals 1

    .line 13
    sget-object v0, Lcom/newrelic/mobile/fbs/Platform;->names:[Ljava/lang/String;

    aget-object p0, v0, p0

    return-object p0
.end method
