.class Lo/adn$1;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/adn;->e(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/adn;


# direct methods
.method constructor <init>(Lo/adn;)V
    .locals 0

    .line 963
    iput-object p1, p0, Lo/adn$1;->e:Lo/adn;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 966
    iget-object v0, p0, Lo/adn$1;->e:Lo/adn;

    invoke-static {}, Lo/adl;->b()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/adn;->a([B)V

    .line 967
    return-void
.end method
