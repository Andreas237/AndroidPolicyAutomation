.class public Lorg/b/a/o;
.super Lorg/b/a/a/d;

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;
.implements Lorg/b/a/p;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/b/a/o$a;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x2796807cf37e0267L


# instance fields
.field private a:Lorg/b/a/c;

.field private b:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/b/a/a/d;-><init>()V

    return-void
.end method

.method public constructor <init>(JLorg/b/a/f;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lorg/b/a/a/d;-><init>(JLorg/b/a/f;)V

    return-void
.end method


# virtual methods
.method public a(Lorg/b/a/d;)Lorg/b/a/o$a;
    .locals 3

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The DateTimeFieldType must not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-virtual {p0}, Lorg/b/a/o;->b()Lorg/b/a/a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/b/a/d;->a(Lorg/b/a/a;)Lorg/b/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lorg/b/a/c;->c()Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Field \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\' is not supported"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p1, Lorg/b/a/o$a;

    invoke-direct {p1, p0, v0}, Lorg/b/a/o$a;-><init>(Lorg/b/a/o;Lorg/b/a/c;)V

    return-object p1
.end method

.method public a(J)V
    .locals 1

    iget v0, p0, Lorg/b/a/o;->b:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lorg/b/a/o;->a:Lorg/b/a/c;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->h(J)J

    move-result-wide p1

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lorg/b/a/o;->a:Lorg/b/a/c;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->g(J)J

    move-result-wide p1

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lorg/b/a/o;->a:Lorg/b/a/c;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->f(J)J

    move-result-wide p1

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lorg/b/a/o;->a:Lorg/b/a/c;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->e(J)J

    move-result-wide p1

    goto :goto_0

    :pswitch_4
    iget-object v0, p0, Lorg/b/a/o;->a:Lorg/b/a/c;

    invoke-virtual {v0, p1, p2}, Lorg/b/a/c;->d(J)J

    move-result-wide p1

    :goto_0
    :pswitch_5
    invoke-super {p0, p1, p2}, Lorg/b/a/a/d;->a(J)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public clone()Ljava/lang/Object;
    .locals 2

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    new-instance v0, Ljava/lang/InternalError;

    const-string v1, "Clone error"

    invoke-direct {v0, v1}, Ljava/lang/InternalError;-><init>(Ljava/lang/String;)V

    throw v0
.end method
