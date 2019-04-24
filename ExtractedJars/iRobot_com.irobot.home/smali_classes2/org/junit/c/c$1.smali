.class Lorg/junit/c/c$1;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/junit/c/a/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/junit/c/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lorg/junit/c/c;


# direct methods
.method constructor <init>(Lorg/junit/c/c;)V
    .locals 0

    iput-object p1, p0, Lorg/junit/c/c$1;->a:Lorg/junit/c/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public a(Ljava/lang/Runnable;)V
    .locals 0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method
