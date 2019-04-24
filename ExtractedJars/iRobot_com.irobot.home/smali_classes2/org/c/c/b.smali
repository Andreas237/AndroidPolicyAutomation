.class public Lorg/c/c/b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final a:Lorg/c/c/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/c/c/b<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lorg/c/c/c;

.field private final c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/c/c/b;

    invoke-direct {v0}, Lorg/c/c/b;-><init>()V

    sput-object v0, Lorg/c/c/b;->a:Lorg/c/c/b;

    return-void
.end method

.method protected constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, v0}, Lorg/c/c/b;-><init>(Ljava/lang/Object;Lorg/c/e/g;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/c/c/b;-><init>(Ljava/lang/Object;Lorg/c/e/g;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lorg/c/e/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lorg/c/e/g<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/c/c/b;->c:Ljava/lang/Object;

    new-instance p1, Lorg/c/c/c;

    invoke-direct {p1}, Lorg/c/c/c;-><init>()V

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Lorg/c/c/c;->putAll(Ljava/util/Map;)V

    :cond_0
    invoke-static {p1}, Lorg/c/c/c;->a(Lorg/c/c/c;)Lorg/c/c/c;

    move-result-object p1

    iput-object p1, p0, Lorg/c/c/b;->b:Lorg/c/c/c;

    return-void
.end method

.method public constructor <init>(Lorg/c/e/g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/c/e/g<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lorg/c/c/b;-><init>(Ljava/lang/Object;Lorg/c/e/g;)V

    return-void
.end method


# virtual methods
.method public a()Lorg/c/c/c;
    .locals 1

    iget-object v0, p0, Lorg/c/c/b;->b:Lorg/c/c/c;

    return-object v0
.end method

.method public b()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lorg/c/c/b;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lorg/c/c/b;->c:Ljava/lang/Object;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lorg/c/c/b;->c:Ljava/lang/Object;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lorg/c/c/b;->c:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/c/c/b;->b:Lorg/c/c/c;

    if-eqz v1, :cond_0

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v1, p0, Lorg/c/c/b;->b:Lorg/c/c/c;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lorg/c/c/b;->b:Lorg/c/c/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_1
    const/16 v1, 0x3e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
