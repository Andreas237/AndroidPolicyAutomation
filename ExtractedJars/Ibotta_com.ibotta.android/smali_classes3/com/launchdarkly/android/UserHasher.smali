.class Lcom/launchdarkly/android/UserHasher;
.super Ljava/lang/Object;
.source "UserHasher.java"


# instance fields
.field private final HashFunction:Lcom/google/common/hash/HashFunction;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    invoke-static {}, Lcom/google/common/hash/Hashing;->sha256()Lcom/google/common/hash/HashFunction;

    move-result-object v0

    iput-object v0, p0, Lcom/launchdarkly/android/UserHasher;->HashFunction:Lcom/google/common/hash/HashFunction;

    return-void
.end method


# virtual methods
.method hash(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 20
    iget-object v0, p0, Lcom/launchdarkly/android/UserHasher;->HashFunction:Lcom/google/common/hash/HashFunction;

    .line 21
    invoke-interface {v0}, Lcom/google/common/hash/HashFunction;->newHasher()Lcom/google/common/hash/Hasher;

    move-result-object v0

    sget-object v1, Lcom/google/common/base/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 22
    invoke-interface {v0, p1, v1}, Lcom/google/common/hash/Hasher;->putString(Ljava/lang/CharSequence;Ljava/nio/charset/Charset;)Lcom/google/common/hash/Hasher;

    move-result-object p1

    .line 23
    invoke-interface {p1}, Lcom/google/common/hash/Hasher;->hash()Lcom/google/common/hash/HashCode;

    move-result-object p1

    .line 24
    invoke-virtual {p1}, Lcom/google/common/hash/HashCode;->asBytes()[B

    move-result-object p1

    const/16 v0, 0xa

    .line 26
    invoke-static {p1, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
