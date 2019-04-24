.class public final enum Lcom/ibotta/android/json/jackson/JacksonJsonFactory;
.super Ljava/lang/Enum;
.source "JacksonJsonFactory.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/json/jackson/JacksonJsonFactory;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/json/jackson/JacksonJsonFactory;

.field public static final enum INSTANCE:Lcom/ibotta/android/json/jackson/JacksonJsonFactory;


# instance fields
.field private confidentialClasses:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field private encryptionKey:Ljava/lang/String;

.field private instances:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/json/jackson/JacksonJson;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 14
    new-instance v0, Lcom/ibotta/android/json/jackson/JacksonJsonFactory;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/json/jackson/JacksonJsonFactory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/json/jackson/JacksonJsonFactory;->INSTANCE:Lcom/ibotta/android/json/jackson/JacksonJsonFactory;

    const/4 v0, 0x1

    .line 13
    new-array v0, v0, [Lcom/ibotta/android/json/jackson/JacksonJsonFactory;

    sget-object v1, Lcom/ibotta/android/json/jackson/JacksonJsonFactory;->INSTANCE:Lcom/ibotta/android/json/jackson/JacksonJsonFactory;

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/json/jackson/JacksonJsonFactory;->$VALUES:[Lcom/ibotta/android/json/jackson/JacksonJsonFactory;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 13
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 15
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/json/jackson/JacksonJsonFactory;->instances:Ljava/util/Map;

    const-string p1, ""

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/json/jackson/JacksonJsonFactory;->encryptionKey:Ljava/lang/String;

    .line 17
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/json/jackson/JacksonJsonFactory;->confidentialClasses:Ljava/util/Set;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/json/jackson/JacksonJsonFactory;
    .locals 1

    .line 13
    const-class v0, Lcom/ibotta/android/json/jackson/JacksonJsonFactory;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/json/jackson/JacksonJsonFactory;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/json/jackson/JacksonJsonFactory;
    .locals 1

    .line 13
    sget-object v0, Lcom/ibotta/android/json/jackson/JacksonJsonFactory;->$VALUES:[Lcom/ibotta/android/json/jackson/JacksonJsonFactory;

    invoke-virtual {v0}, [Lcom/ibotta/android/json/jackson/JacksonJsonFactory;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/json/jackson/JacksonJsonFactory;

    return-object v0
.end method


# virtual methods
.method public declared-synchronized getInstance(Lcom/ibotta/android/json/NamingPolicy;ZZ)Lcom/ibotta/android/json/jackson/JacksonJson;
    .locals 3

    monitor-enter p0

    .line 26
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    invoke-virtual {p1}, Lcom/ibotta/android/json/NamingPolicy;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    invoke-static {p2}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    invoke-static {p3}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 32
    iget-object v1, p0, Lcom/ibotta/android/json/jackson/JacksonJsonFactory;->instances:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/json/jackson/JacksonJson;

    if-nez v1, :cond_1

    if-eqz p3, :cond_0

    .line 34
    new-instance p3, Lcom/ibotta/android/json/jackson/EncryptedJacksonJson;

    iget-object v1, p0, Lcom/ibotta/android/json/jackson/JacksonJsonFactory;->encryptionKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/ibotta/android/json/jackson/JacksonJsonFactory;->confidentialClasses:Ljava/util/Set;

    invoke-direct {p3, p1, p2, v1, v2}, Lcom/ibotta/android/json/jackson/EncryptedJacksonJson;-><init>(Lcom/ibotta/android/json/NamingPolicy;ZLjava/lang/String;Ljava/util/Set;)V

    goto :goto_0

    :cond_0
    new-instance p3, Lcom/ibotta/android/json/jackson/JacksonJson;

    invoke-direct {p3, p1, p2}, Lcom/ibotta/android/json/jackson/JacksonJson;-><init>(Lcom/ibotta/android/json/NamingPolicy;Z)V

    :goto_0
    move-object v1, p3

    .line 37
    iget-object p1, p0, Lcom/ibotta/android/json/jackson/JacksonJsonFactory;->instances:Ljava/util/Map;

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    :cond_1
    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public initEncryption(Ljava/lang/String;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;)V"
        }
    .end annotation

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/json/jackson/JacksonJsonFactory;->encryptionKey:Ljava/lang/String;

    .line 21
    iget-object p1, p0, Lcom/ibotta/android/json/jackson/JacksonJsonFactory;->confidentialClasses:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->clear()V

    .line 22
    iget-object p1, p0, Lcom/ibotta/android/json/jackson/JacksonJsonFactory;->confidentialClasses:Ljava/util/Set;

    invoke-interface {p1, p2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-void
.end method
