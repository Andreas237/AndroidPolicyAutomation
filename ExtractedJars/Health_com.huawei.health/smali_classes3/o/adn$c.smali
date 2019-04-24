.class Lo/adn$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/adn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field private final b:[B

.field final synthetic c:Lo/adn;

.field private d:Z

.field private final e:Lo/adn$b;


# direct methods
.method public constructor <init>(Lo/adn;[BLo/adn$b;)V
    .locals 4

    .line 1117
    iput-object p1, p0, Lo/adn$c;->c:Lo/adn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1115
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/adn$c;->d:Z

    .line 1118
    iput-object p2, p0, Lo/adn$c;->b:[B

    .line 1119
    iput-object p3, p0, Lo/adn$c;->e:Lo/adn$b;

    .line 1120
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SendRunCmd ack "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p3}, Lo/adn$b;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1121
    return-void
.end method


# virtual methods
.method public e(Z)V
    .locals 4

    .line 1124
    iput-boolean p1, p0, Lo/adn$c;->d:Z

    .line 1125
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isRunning "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/adn$c;->d:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1126
    return-void
.end method

.method public run()V
    .locals 5

    .line 1130
    iget-object v0, p0, Lo/adn$c;->c:Lo/adn;

    const/4 v1, 0x0

    iput-object v1, v0, Lo/adn;->d:Lo/adn$b;

    .line 1131
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "run isRunning "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/adn$c;->d:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1132
    const/4 v4, 0x0

    .line 1133
    :goto_0
    iget-boolean v0, p0, Lo/adn$c;->d:Z

    if-eqz v0, :cond_1

    move v0, v4

    add-int/lit8 v4, v4, 0x1

    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    .line 1134
    iget-object v0, p0, Lo/adn$c;->c:Lo/adn;

    iget-object v0, v0, Lo/adn;->d:Lo/adn$b;

    iget-object v1, p0, Lo/adn$c;->e:Lo/adn$b;

    if-ne v0, v1, :cond_0

    .line 1135
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "expectAck == enumAck"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1136
    goto :goto_1

    .line 1138
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SendRunCmd enumAck "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/adn$c;->e:Lo/adn$b;

    invoke-virtual {v3}, Lo/adn$b;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " expectAck "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1139
    iget-object v0, p0, Lo/adn$c;->c:Lo/adn;

    iget-object v1, p0, Lo/adn$c;->b:[B

    invoke-virtual {v0, v1}, Lo/adn;->a([B)V

    goto :goto_0

    .line 1141
    :cond_1
    :goto_1
    return-void
.end method
