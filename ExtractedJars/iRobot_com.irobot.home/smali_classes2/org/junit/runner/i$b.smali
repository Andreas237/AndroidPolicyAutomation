.class Lorg/junit/runner/i$b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/junit/runner/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final b:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/junit/runner/b/a;",
            ">;"
        }
    .end annotation
.end field

.field private final d:J

.field private final e:J


# direct methods
.method private constructor <init>(Ljava/io/ObjectInputStream$GetField;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "fCount"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Ljava/io/ObjectInputStream$GetField;->get(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object v0, p0, Lorg/junit/runner/i$b;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    const-string v0, "fIgnoreCount"

    invoke-virtual {p1, v0, v1}, Ljava/io/ObjectInputStream$GetField;->get(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object v0, p0, Lorg/junit/runner/i$b;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    const-string v0, "fFailures"

    invoke-virtual {p1, v0, v1}, Ljava/io/ObjectInputStream$GetField;->get(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lorg/junit/runner/i$b;->c:Ljava/util/List;

    const-string v0, "fRunTime"

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2}, Ljava/io/ObjectInputStream$GetField;->get(Ljava/lang/String;J)J

    move-result-wide v3

    iput-wide v3, p0, Lorg/junit/runner/i$b;->d:J

    const-string v0, "fStartTime"

    invoke-virtual {p1, v0, v1, v2}, Ljava/io/ObjectInputStream$GetField;->get(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lorg/junit/runner/i$b;->e:J

    return-void
.end method

.method public constructor <init>(Lorg/junit/runner/i;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lorg/junit/runner/i;->c(Lorg/junit/runner/i;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/junit/runner/i$b;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-static {p1}, Lorg/junit/runner/i;->e(Lorg/junit/runner/i;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    iput-object v0, p0, Lorg/junit/runner/i$b;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1}, Lorg/junit/runner/i;->d(Lorg/junit/runner/i;)Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lorg/junit/runner/i$b;->c:Ljava/util/List;

    invoke-static {p1}, Lorg/junit/runner/i;->b(Lorg/junit/runner/i;)Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lorg/junit/runner/i$b;->d:J

    invoke-static {p1}, Lorg/junit/runner/i;->a(Lorg/junit/runner/i;)Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lorg/junit/runner/i$b;->e:J

    return-void
.end method

.method static synthetic a(Lorg/junit/runner/i$b;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    iget-object p0, p0, Lorg/junit/runner/i$b;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method public static a(Ljava/io/ObjectInputStream;)Lorg/junit/runner/i$b;
    .locals 1

    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readFields()Ljava/io/ObjectInputStream$GetField;

    move-result-object p0

    new-instance v0, Lorg/junit/runner/i$b;

    invoke-direct {v0, p0}, Lorg/junit/runner/i$b;-><init>(Ljava/io/ObjectInputStream$GetField;)V

    return-object v0
.end method

.method static synthetic b(Lorg/junit/runner/i$b;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    iget-object p0, p0, Lorg/junit/runner/i$b;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method static synthetic c(Lorg/junit/runner/i$b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lorg/junit/runner/i$b;->c:Ljava/util/List;

    return-object p0
.end method

.method static synthetic d(Lorg/junit/runner/i$b;)J
    .locals 2

    iget-wide v0, p0, Lorg/junit/runner/i$b;->d:J

    return-wide v0
.end method

.method static synthetic e(Lorg/junit/runner/i$b;)J
    .locals 2

    iget-wide v0, p0, Lorg/junit/runner/i$b;->e:J

    return-wide v0
.end method


# virtual methods
.method public a(Ljava/io/ObjectOutputStream;)V
    .locals 4

    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->putFields()Ljava/io/ObjectOutputStream$PutField;

    move-result-object v0

    const-string v1, "fCount"

    iget-object v2, p0, Lorg/junit/runner/i$b;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v1, v2}, Ljava/io/ObjectOutputStream$PutField;->put(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "fIgnoreCount"

    iget-object v2, p0, Lorg/junit/runner/i$b;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v1, v2}, Ljava/io/ObjectOutputStream$PutField;->put(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "fFailures"

    iget-object v2, p0, Lorg/junit/runner/i$b;->c:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Ljava/io/ObjectOutputStream$PutField;->put(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "fRunTime"

    iget-wide v2, p0, Lorg/junit/runner/i$b;->d:J

    invoke-virtual {v0, v1, v2, v3}, Ljava/io/ObjectOutputStream$PutField;->put(Ljava/lang/String;J)V

    const-string v1, "fStartTime"

    iget-wide v2, p0, Lorg/junit/runner/i$b;->e:J

    invoke-virtual {v0, v1, v2, v3}, Ljava/io/ObjectOutputStream$PutField;->put(Ljava/lang/String;J)V

    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->writeFields()V

    return-void
.end method
