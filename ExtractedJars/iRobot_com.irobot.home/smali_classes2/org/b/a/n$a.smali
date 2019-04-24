.class public final Lorg/b/a/n$a;
.super Lorg/b/a/c/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/b/a/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x145b9adbd6050L


# instance fields
.field private transient a:Lorg/b/a/n;

.field private transient b:Lorg/b/a/c;


# direct methods
.method constructor <init>(Lorg/b/a/n;Lorg/b/a/c;)V
    .locals 0

    invoke-direct {p0}, Lorg/b/a/c/a;-><init>()V

    iput-object p1, p0, Lorg/b/a/n$a;->a:Lorg/b/a/n;

    iput-object p2, p0, Lorg/b/a/n$a;->b:Lorg/b/a/c;

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/b/a/n;

    iput-object v0, p0, Lorg/b/a/n$a;->a:Lorg/b/a/n;

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/b/a/d;

    iget-object v0, p0, Lorg/b/a/n$a;->a:Lorg/b/a/n;

    invoke-virtual {v0}, Lorg/b/a/n;->c()Lorg/b/a/a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/b/a/d;->a(Lorg/b/a/a;)Lorg/b/a/c;

    move-result-object p1

    iput-object p1, p0, Lorg/b/a/n$a;->b:Lorg/b/a/c;

    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 1

    iget-object v0, p0, Lorg/b/a/n$a;->a:Lorg/b/a/n;

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    iget-object v0, p0, Lorg/b/a/n$a;->b:Lorg/b/a/c;

    invoke-virtual {v0}, Lorg/b/a/c;->a()Lorg/b/a/d;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()Lorg/b/a/c;
    .locals 1

    iget-object v0, p0, Lorg/b/a/n$a;->b:Lorg/b/a/c;

    return-object v0
.end method

.method protected b()J
    .locals 2

    iget-object v0, p0, Lorg/b/a/n$a;->a:Lorg/b/a/n;

    invoke-virtual {v0}, Lorg/b/a/n;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method protected c()Lorg/b/a/a;
    .locals 1

    iget-object v0, p0, Lorg/b/a/n$a;->a:Lorg/b/a/n;

    invoke-virtual {v0}, Lorg/b/a/n;->c()Lorg/b/a/a;

    move-result-object v0

    return-object v0
.end method
