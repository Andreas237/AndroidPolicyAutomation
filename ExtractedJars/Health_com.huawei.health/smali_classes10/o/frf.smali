.class public abstract Lo/frf;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/frf$2;,
        Lo/frf$b;
    }
.end annotation


# instance fields
.field private b:Lo/frf$b;


# direct methods
.method protected constructor <init>(Lo/frf$b;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-object p1, p0, Lo/frf;->b:Lo/frf$b;

    .line 65
    return-void
.end method

.method public static c(I[BLjava/net/InetSocketAddress;)Lo/frf;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 135
    invoke-static {p0}, Lo/frf$b;->b(I)Lo/frf$b;

    move-result-object v2

    .line 136
    if-nez v2, :cond_0

    .line 137
    const/4 v0, 0x0

    return-object v0

    .line 139
    :cond_0
    sget-object v0, Lo/frf$2;->e:[I

    invoke-virtual {v2}, Lo/frf$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 142
    :pswitch_0
    invoke-static {p1}, Lo/fsj;->c([B)Lo/frf;

    move-result-object v0

    return-object v0

    .line 144
    :pswitch_1
    invoke-static {p1}, Lo/fsg;->d([B)Lo/frf;

    move-result-object v0

    return-object v0

    .line 146
    :pswitch_2
    invoke-static {p1}, Lo/fqj;->e([B)Lo/fqj;

    move-result-object v0

    return-object v0

    .line 148
    :pswitch_3
    invoke-static {p1}, Lo/fru;->e([B)Lo/fru;

    move-result-object v0

    return-object v0

    .line 150
    :pswitch_4
    invoke-static {p1, p2}, Lo/frh;->b([BLjava/net/InetSocketAddress;)Lo/frh;

    move-result-object v0

    return-object v0

    .line 152
    :pswitch_5
    invoke-static {p1, p2}, Lo/fry;->c([BLjava/net/InetSocketAddress;)Lo/fry;

    move-result-object v0

    return-object v0

    .line 154
    :goto_0
    const/4 v0, 0x0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method


# virtual methods
.method public abstract b()I
.end method

.method public final d()[B
    .locals 3

    .line 91
    new-instance v2, Lo/fpp;

    invoke-direct {v2}, Lo/fpp;-><init>()V

    .line 93
    iget-object v0, p0, Lo/frf;->b:Lo/frf$b;

    invoke-virtual {v0}, Lo/frf$b;->a()I

    move-result v0

    const/16 v1, 0x10

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 94
    invoke-virtual {p0, v2}, Lo/frf;->e(Lo/fpp;)V

    .line 95
    invoke-virtual {v2}, Lo/fpp;->e()[B

    move-result-object v0

    return-object v0
.end method

.method final e()Lo/frf$b;
    .locals 1

    .line 169
    iget-object v0, p0, Lo/frf;->b:Lo/frf$b;

    return-object v0
.end method

.method protected abstract e(Lo/fpp;)V
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 163
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 164
    const-string v0, "\t\t\tExtension: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/frf;->b:Lo/frf$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/frf;->b:Lo/frf$b;

    invoke-virtual {v1}, Lo/frf$b;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
