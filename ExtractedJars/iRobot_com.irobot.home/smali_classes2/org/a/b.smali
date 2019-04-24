.class public interface abstract Lorg/a/b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/a/b$a;
    }
.end annotation


# static fields
.field public static final a:Lorg/a/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/a/b$a;

    invoke-direct {v0}, Lorg/a/b$a;-><init>()V

    sput-object v0, Lorg/a/b;->a:Lorg/a/b;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;)Lorg/a/b;
.end method

.method public abstract a(Ljava/lang/String;)Lorg/a/b;
.end method

.method public abstract a(Lorg/a/d;)Lorg/a/b;
.end method
