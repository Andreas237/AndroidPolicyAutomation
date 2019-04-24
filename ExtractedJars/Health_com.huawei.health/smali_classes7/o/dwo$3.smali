.class Lo/dwo$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dwo;->b(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic e:Lo/dwo;


# direct methods
.method constructor <init>(Lo/dwo;Ljava/lang/String;)V
    .locals 0

    .line 153
    iput-object p1, p0, Lo/dwo$3;->e:Lo/dwo;

    iput-object p2, p0, Lo/dwo$3;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    .line 155
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 156
    const-string v0, "taskId"

    iget-object v1, p0, Lo/dwo$3;->a:Ljava/lang/String;

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    invoke-static {}, Lo/dwo;->h()Lo/dwr;

    move-result-object v0

    const/16 v1, 0xc

    invoke-virtual {v0, v1, v3}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v4

    .line 158
    instance-of v0, v4, Lo/dvq;

    if-eqz v0, :cond_9

    .line 159
    move-object v5, v4

    check-cast v5, Lo/dvq;

    .line 160
    invoke-virtual {v5}, Lo/dvq;->o()J

    move-result-wide v6

    .line 161
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 162
    invoke-virtual {v5}, Lo/dvq;->l()Ljava/lang/String;

    move-result-object v10

    .line 163
    invoke-static {v8, v9, v6, v7}, Lo/dzo;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 164
    invoke-static {}, Lo/dwo;->i()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "curTimeStamp is invalid ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    return-void

    .line 167
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 168
    iget-object v0, p0, Lo/dwo$3;->a:Ljava/lang/String;

    invoke-static {v0}, Lo/dzo;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 169
    invoke-static {}, Lo/dwo;->g()Lo/dwu;

    move-result-object v0

    iget-object v1, p0, Lo/dwo$3;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/dwu;->d(Ljava/lang/String;)V

    .line 170
    iget-object v0, p0, Lo/dwo$3;->e:Lo/dwo;

    invoke-static {v0}, Lo/dwo;->e(Lo/dwo;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "NEWBIE"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 171
    const-string v0, "done"

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 172
    invoke-static {}, Lo/dwo;->i()Ljava/lang/String;

    move-result-object v0

    const-string v1, "not show,not deal!"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    return-void

    .line 176
    :cond_1
    iget-object v0, p0, Lo/dwo$3;->e:Lo/dwo;

    invoke-static {v0}, Lo/dwo;->e(Lo/dwo;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "taskReachInfo"

    iget-object v2, p0, Lo/dwo$3;->a:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lo/dvq;->c(J)V

    .line 178
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/dvq;->f(Ljava/lang/String;)V

    .line 179
    const/4 v0, -0x1

    invoke-virtual {v5, v0}, Lo/dvq;->h(I)V

    .line 180
    invoke-static {}, Lo/dwo;->h()Lo/dwr;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/dwr;->d(Lo/dvf;)Z

    .line 182
    iget-object v0, p0, Lo/dwo$3;->e:Lo/dwo;

    iget-object v1, p0, Lo/dwo$3;->a:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/dwo;->d(Ljava/lang/String;I)V

    goto/16 :goto_0

    .line 184
    :cond_2
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 185
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lo/dvq;->c(J)V

    .line 186
    invoke-static {}, Lo/dwo;->h()Lo/dwr;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/dwr;->d(Lo/dvf;)Z

    .line 187
    const v0, 0x33464

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/dwo$3;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 188
    iget-object v0, p0, Lo/dwo$3;->e:Lo/dwo;

    iget-object v1, p0, Lo/dwo$3;->a:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/dwo;->d(Ljava/lang/String;I)V

    goto/16 :goto_0

    .line 190
    :cond_3
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 191
    iget-object v0, p0, Lo/dwo$3;->a:Ljava/lang/String;

    invoke-static {v0}, Lo/dzo;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {v6, v7, v8, v9}, Lo/dzo;->b(JJ)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 192
    iget-object v0, p0, Lo/dwo$3;->e:Lo/dwo;

    invoke-static {v0}, Lo/dwo;->e(Lo/dwo;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "taskReachInfo"

    iget-object v2, p0, Lo/dwo$3;->a:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lo/dvq;->c(J)V

    .line 194
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/dvq;->f(Ljava/lang/String;)V

    .line 195
    const/4 v0, -0x1

    invoke-virtual {v5, v0}, Lo/dvq;->h(I)V

    .line 197
    const v0, 0x33464

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/dwo$3;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 198
    iget-object v0, p0, Lo/dwo$3;->e:Lo/dwo;

    iget-object v1, p0, Lo/dwo$3;->a:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/dwo;->d(Ljava/lang/String;I)V

    .line 200
    :cond_4
    invoke-static {}, Lo/dwo;->h()Lo/dwr;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/dwr;->d(Lo/dvf;)Z

    goto :goto_0

    .line 202
    :cond_5
    invoke-static {}, Lo/dwo;->i()Ljava/lang/String;

    move-result-object v0

    const-string v1, "taskStatus is TASK_PICKED"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    const v0, 0x1fbda

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/dwo$3;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 205
    iget-object v0, p0, Lo/dwo$3;->e:Lo/dwo;

    iget-object v1, p0, Lo/dwo$3;->a:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/dwo;->d(Ljava/lang/String;I)V

    .line 207
    :cond_6
    return-void

    .line 210
    :cond_7
    invoke-static {}, Lo/dwo;->i()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "taskStatus is lapsed ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    return-void

    .line 213
    :cond_8
    :goto_0
    goto :goto_1

    .line 214
    :cond_9
    invoke-static {}, Lo/dwo;->i()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Not Found Record"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    :goto_1
    return-void
.end method
