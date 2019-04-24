.class public final enum Lcom/tencent/open/qzone/Albums$AlbumSecurity;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/open/qzone/Albums;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "AlbumSecurity"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/tencent/open/qzone/Albums$AlbumSecurity;>;"
    }
.end annotation


# static fields
.field private static final synthetic b:[Lcom/tencent/open/qzone/Albums$AlbumSecurity;

.field public static final enum friendsOnly:Lcom/tencent/open/qzone/Albums$AlbumSecurity;

.field public static final enum needQuestion:Lcom/tencent/open/qzone/Albums$AlbumSecurity;

.field public static final enum privateOnly:Lcom/tencent/open/qzone/Albums$AlbumSecurity;

.field public static final enum publicToAll:Lcom/tencent/open/qzone/Albums$AlbumSecurity;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 39
    new-instance v0, Lcom/tencent/open/qzone/Albums$AlbumSecurity;

    const-string v1, "publicToAll"

    const-string v2, "1"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/tencent/open/qzone/Albums$AlbumSecurity;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/tencent/open/qzone/Albums$AlbumSecurity;->publicToAll:Lcom/tencent/open/qzone/Albums$AlbumSecurity;

    .line 40
    new-instance v0, Lcom/tencent/open/qzone/Albums$AlbumSecurity;

    const-string v1, "privateOnly"

    const-string v2, "2"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v2}, Lcom/tencent/open/qzone/Albums$AlbumSecurity;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/tencent/open/qzone/Albums$AlbumSecurity;->privateOnly:Lcom/tencent/open/qzone/Albums$AlbumSecurity;

    .line 41
    new-instance v0, Lcom/tencent/open/qzone/Albums$AlbumSecurity;

    const-string v1, "friendsOnly"

    const-string v2, "4"

    const/4 v3, 0x2

    invoke-direct {v0, v1, v3, v2}, Lcom/tencent/open/qzone/Albums$AlbumSecurity;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/tencent/open/qzone/Albums$AlbumSecurity;->friendsOnly:Lcom/tencent/open/qzone/Albums$AlbumSecurity;

    .line 42
    new-instance v0, Lcom/tencent/open/qzone/Albums$AlbumSecurity;

    const-string v1, "needQuestion"

    const-string v2, "5"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v3, v2}, Lcom/tencent/open/qzone/Albums$AlbumSecurity;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/tencent/open/qzone/Albums$AlbumSecurity;->needQuestion:Lcom/tencent/open/qzone/Albums$AlbumSecurity;

    .line 38
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/tencent/open/qzone/Albums$AlbumSecurity;

    sget-object v1, Lcom/tencent/open/qzone/Albums$AlbumSecurity;->publicToAll:Lcom/tencent/open/qzone/Albums$AlbumSecurity;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/tencent/open/qzone/Albums$AlbumSecurity;->privateOnly:Lcom/tencent/open/qzone/Albums$AlbumSecurity;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/tencent/open/qzone/Albums$AlbumSecurity;->friendsOnly:Lcom/tencent/open/qzone/Albums$AlbumSecurity;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/tencent/open/qzone/Albums$AlbumSecurity;->needQuestion:Lcom/tencent/open/qzone/Albums$AlbumSecurity;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lcom/tencent/open/qzone/Albums$AlbumSecurity;->b:[Lcom/tencent/open/qzone/Albums$AlbumSecurity;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)V"
        }
    .end annotation

    .line 45
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 46
    iput-object p3, p0, Lcom/tencent/open/qzone/Albums$AlbumSecurity;->a:Ljava/lang/String;

    .line 47
    return-void
.end method


# virtual methods
.method public getSecurity()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/tencent/open/qzone/Albums$AlbumSecurity;->a:Ljava/lang/String;

    return-object v0
.end method
