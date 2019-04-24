.class Lo/dwu$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dwu;->c(Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lo/dwu;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/dwu;Ljava/lang/String;I)V
    .locals 0

    .line 134
    iput-object p1, p0, Lo/dwu$3;->b:Lo/dwu;

    iput-object p2, p0, Lo/dwu$3;->e:Ljava/lang/String;

    iput p3, p0, Lo/dwu$3;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 136
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 137
    const-string v0, "taskId"

    iget-object v1, p0, Lo/dwu$3;->e:Ljava/lang/String;

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    invoke-static {}, Lo/dwu;->a()Lo/dwr;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1, v4}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v5

    .line 139
    invoke-static {}, Lo/dwu;->a()Lo/dwr;

    move-result-object v0

    const/16 v1, 0xe

    invoke-virtual {v0, v1, v4}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v6

    .line 140
    iget-object v0, p0, Lo/dwu$3;->e:Ljava/lang/String;

    invoke-static {v0}, Lo/dzt;->a(Ljava/lang/String;)I

    move-result v7

    .line 141
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    instance-of v0, v5, Lo/dve;

    if-eqz v0, :cond_1

    .line 142
    move-object v8, v5

    check-cast v8, Lo/dve;

    .line 143
    invoke-virtual {v8}, Lo/dve;->e()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/dzo;->b(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 144
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lo/dve;->b(J)V

    .line 145
    invoke-virtual {v8}, Lo/dve;->d()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v8, v0}, Lo/dve;->d(I)V

    .line 146
    const-wide/16 v0, 0x0

    invoke-virtual {v8, v0, v1}, Lo/dve;->e(J)V

    .line 147
    iget-object v0, p0, Lo/dwu$3;->b:Lo/dwu;

    invoke-virtual {v0, v8}, Lo/dwu;->e(Lo/dve;)V

    goto :goto_0

    .line 149
    :cond_0
    invoke-static {}, Lo/dwu;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "level event is completed"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    :goto_0
    goto :goto_1

    .line 152
    :cond_1
    new-instance v8, Lo/dve;

    invoke-direct {v8}, Lo/dve;-><init>()V

    .line 153
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lo/dve;->d(I)V

    .line 154
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lo/dve;->b(I)V

    .line 155
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lo/dve;->b(J)V

    .line 156
    invoke-virtual {v8, v7}, Lo/dve;->e(I)V

    .line 157
    iget-object v0, p0, Lo/dwu$3;->e:Ljava/lang/String;

    invoke-virtual {v8, v0}, Lo/dve;->d(Ljava/lang/String;)V

    .line 158
    const-wide/16 v0, 0x0

    invoke-virtual {v8, v0, v1}, Lo/dve;->e(J)V

    .line 159
    iget-object v0, p0, Lo/dwu$3;->b:Lo/dwu;

    invoke-virtual {v0, v8}, Lo/dwu;->e(Lo/dve;)V

    .line 161
    :goto_1
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    instance-of v0, v6, Lo/dvj;

    if-eqz v0, :cond_2

    .line 162
    move-object v8, v6

    check-cast v8, Lo/dvj;

    .line 163
    iget-object v0, p0, Lo/dwu$3;->b:Lo/dwu;

    iget v1, p0, Lo/dwu$3;->a:I

    invoke-virtual {v0, v1, v8}, Lo/dwu;->d(ILo/dvj;)V

    .line 164
    goto :goto_2

    .line 165
    :cond_2
    new-instance v8, Lo/dvj;

    invoke-direct {v8}, Lo/dvj;-><init>()V

    .line 166
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lo/dvj;->c(I)V

    .line 167
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lo/dvj;->b(I)V

    .line 168
    const-wide/16 v0, 0x0

    invoke-virtual {v8, v0, v1}, Lo/dvj;->b(D)V

    .line 169
    iget-object v0, p0, Lo/dwu$3;->b:Lo/dwu;

    invoke-virtual {v0, v7, v8}, Lo/dwu;->d(ILo/dvj;)V

    .line 171
    :goto_2
    return-void
.end method
