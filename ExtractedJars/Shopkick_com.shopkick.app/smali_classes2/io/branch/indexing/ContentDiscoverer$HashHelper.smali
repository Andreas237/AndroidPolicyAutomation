.class Lio/branch/indexing/ContentDiscoverer$HashHelper;
.super Ljava/lang/Object;
.source "ContentDiscoverer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/branch/indexing/ContentDiscoverer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "HashHelper"
.end annotation


# instance fields
.field messageDigest_:Ljava/security/MessageDigest;

.field final synthetic this$0:Lio/branch/indexing/ContentDiscoverer;


# direct methods
.method constructor <init>(Lio/branch/indexing/ContentDiscoverer;)V
    .locals 0

    .line 378
    iput-object p1, p0, Lio/branch/indexing/ContentDiscoverer$HashHelper;->this$0:Lio/branch/indexing/ContentDiscoverer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :try_start_0
    const-string p1, "MD5"

    .line 380
    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object p1

    iput-object p1, p0, Lio/branch/indexing/ContentDiscoverer$HashHelper;->messageDigest_:Ljava/security/MessageDigest;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method


# virtual methods
.method hashContent(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, ""

    .line 387
    iget-object v1, p0, Lio/branch/indexing/ContentDiscoverer$HashHelper;->messageDigest_:Ljava/security/MessageDigest;

    if-eqz v1, :cond_0

    .line 388
    invoke-virtual {v1}, Ljava/security/MessageDigest;->reset()V

    .line 389
    iget-object v0, p0, Lio/branch/indexing/ContentDiscoverer$HashHelper;->messageDigest_:Ljava/security/MessageDigest;

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->update([B)V

    .line 391
    new-instance v0, Ljava/lang/String;

    iget-object p1, p0, Lio/branch/indexing/ContentDiscoverer$HashHelper;->messageDigest_:Ljava/security/MessageDigest;

    invoke-virtual {p1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/String;-><init>([B)V

    :cond_0
    return-object v0
.end method
