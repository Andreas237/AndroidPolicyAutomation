.class public final enum Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;
.super Ljava/lang/Enum;
.source "StorageException.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/commons/disk/StorageException;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "StorageIssue"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;",
        "",
        "(Ljava/lang/String;I)V",
        "NOT_WRITABLE",
        "FAILED_CREATE",
        "FAILED_DELETE",
        "ibotta-commons_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;

.field public static final enum FAILED_CREATE:Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;

.field public static final enum FAILED_DELETE:Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;

.field public static final enum NOT_WRITABLE:Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;

    new-instance v1, Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;

    const-string v2, "NOT_WRITABLE"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;->NOT_WRITABLE:Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;

    const-string v2, "FAILED_CREATE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;->FAILED_CREATE:Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;

    aput-object v1, v0, v3

    new-instance v1, Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;

    const-string v2, "FAILED_DELETE"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;->FAILED_DELETE:Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;->$VALUES:[Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 11
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;
    .locals 1

    const-class v0, Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;
    .locals 1

    sget-object v0, Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;->$VALUES:[Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;

    invoke-virtual {v0}, [Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;

    return-object v0
.end method
