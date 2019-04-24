.class public Lo/dpu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static e:Z


# instance fields
.field private a:Lo/dpv$b$d;

.field private b:Landroid/os/Handler;

.field private final c:Z

.field private d:Landroid/content/Context;

.field private f:Ljava/lang/Boolean;

.field private h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 27
    const/4 v0, 0x0

    sput-boolean v0, Lo/dpu;->e:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/Boolean;ZZ)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lo/dpu;->d:Landroid/content/Context;

    .line 44
    iput-object p2, p0, Lo/dpu;->b:Landroid/os/Handler;

    .line 45
    iput-object p3, p0, Lo/dpu;->f:Ljava/lang/Boolean;

    .line 46
    iput-boolean p4, p0, Lo/dpu;->h:Z

    .line 47
    iput-boolean p5, p0, Lo/dpu;->c:Z

    .line 48
    return-void
.end method

.method public static a(Z)V
    .locals 0

    .line 30
    sput-boolean p0, Lo/dpu;->e:Z

    .line 31
    return-void
.end method

.method private d()Ljava/lang/String;
    .locals 5

    .line 137
    iget-object v0, p0, Lo/dpu;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    .line 138
    iget-object v0, v2, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v3

    .line 139
    iget-object v0, v2, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v4

    .line 140
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private e(Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/dpv$b$c;>;)Ljava/util/List<Lo/dpd;>;"
        }
    .end annotation

    .line 167
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 168
    if-eqz p1, :cond_2

    .line 169
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_2

    .line 170
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/dpv$b$c;

    .line 171
    new-instance v4, Lo/dpd;

    invoke-direct {v4}, Lo/dpd;-><init>()V

    .line 172
    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    .line 173
    const-string v0, ""

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 174
    if-eqz v3, :cond_1

    .line 175
    iget-object v0, v3, Lo/dpv$b$c;->b:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lo/dpd;->c(Ljava/lang/String;)V

    .line 176
    const/4 v6, 0x0

    :goto_1
    iget-object v0, v3, Lo/dpv$b$c;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_0

    .line 177
    iget-object v0, v3, Lo/dpv$b$c;->c:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 176
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 179
    :cond_0
    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/dpd;->a(Ljava/lang/String;)V

    .line 180
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 182
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/dpd;->c(Ljava/lang/String;)V

    .line 169
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 186
    :cond_2
    return-object v1
.end method

.method private e(ILjava/lang/Object;)V
    .locals 2

    .line 125
    iget-object v0, p0, Lo/dpu;->b:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 126
    return-void

    .line 128
    :cond_0
    iget-object v0, p0, Lo/dpu;->b:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 129
    iput p1, v1, Landroid/os/Message;->what:I

    .line 130
    iput-object p2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 131
    sget-boolean v0, Lo/dpu;->e:Z

    if-nez v0, :cond_1

    .line 132
    iget-object v0, p0, Lo/dpu;->b:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 134
    :cond_1
    return-void
.end method


# virtual methods
.method public e(Lo/dpv$b;)Lo/dpv$b$d;
    .locals 6

    .line 144
    const/4 v4, 0x0

    .line 145
    if-nez p1, :cond_0

    .line 146
    const-string v0, "AppPullChangeLogThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFeatureWhenPullChangeLogSuccess---msgObjOfCallBack==null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    const/4 v0, 0x0

    return-object v0

    .line 149
    :cond_0
    move-object v5, p1

    .line 150
    const-string v0, "AppPullChangeLogThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pull change log success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    const-string v0, "AppPullChangeLogThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "changeLogXml.CURRENT_LANGUAGE "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v5, Lo/dpv$b;->e:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    iget v0, v5, Lo/dpv$b;->e:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 154
    iget-object v0, v5, Lo/dpv$b;->c:Ljava/util/List;

    iget v1, v5, Lo/dpv$b;->e:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/dpv$b$d;

    goto :goto_0

    .line 156
    :cond_1
    iget v0, v5, Lo/dpv$b;->b:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 157
    iget-object v0, v5, Lo/dpv$b;->c:Ljava/util/List;

    iget v1, v5, Lo/dpv$b;->b:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/dpv$b$d;

    goto :goto_0

    .line 159
    :cond_2
    const/4 v4, 0x0

    .line 163
    :goto_0
    return-object v4
.end method

.method public run()V
    .locals 8

    .line 52
    const/4 v4, 0x0

    .line 53
    :try_start_0
    iget-object v0, p0, Lo/dpu;->f:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 54
    invoke-static {}, Lo/dpm;->m()Lo/doy;

    move-result-object v0

    iget-object v0, v0, Lo/doy;->w:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 55
    invoke-static {}, Lo/dpm;->m()Lo/doy;

    move-result-object v0

    iget-object v0, v0, Lo/doy;->w:Ljava/lang/String;

    const-string v1, "full/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    aget-object v1, v5, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "full/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "changelog.xml"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 57
    invoke-direct {p0}, Lo/dpu;->d()Ljava/lang/String;

    move-result-object v7

    .line 58
    const-string v0, "AppPullChangeLogThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "APP: current system language="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    iget-object v0, p0, Lo/dpu;->d:Landroid/content/Context;

    invoke-static {v0, v6, v7}, Lo/dpv;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lo/dpv$b;

    move-result-object v4

    .line 60
    goto/16 :goto_0

    .line 61
    :cond_0
    const-string v0, "AppPullChangeLogThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DOWNLOADURL is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    const/4 v4, 0x0

    goto/16 :goto_0

    .line 65
    :cond_1
    iget-boolean v0, p0, Lo/dpu;->h:Z

    if-eqz v0, :cond_3

    .line 66
    invoke-static {}, Lo/dpm;->p()Lo/doy;

    move-result-object v0

    iget-object v0, v0, Lo/doy;->w:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 67
    invoke-static {}, Lo/dpm;->p()Lo/doy;

    move-result-object v0

    iget-object v0, v0, Lo/doy;->w:Ljava/lang/String;

    const-string v1, "full/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    aget-object v1, v5, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "full/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "changelog.xml"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 69
    invoke-direct {p0}, Lo/dpu;->d()Ljava/lang/String;

    move-result-object v7

    .line 70
    const-string v0, "AppPullChangeLogThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AW70 Band: current system language="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    iget-object v0, p0, Lo/dpu;->d:Landroid/content/Context;

    invoke-static {v0, v6, v7}, Lo/dpv;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lo/dpv$b;

    move-result-object v4

    .line 72
    goto/16 :goto_0

    .line 73
    :cond_2
    const-string v0, "AppPullChangeLogThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AW70 DOWNLOADURL is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    const/4 v4, 0x0

    goto/16 :goto_0

    .line 76
    :cond_3
    iget-boolean v0, p0, Lo/dpu;->c:Z

    if-eqz v0, :cond_5

    .line 77
    invoke-static {}, Lo/dpm;->n()Lo/doy;

    move-result-object v0

    iget-object v0, v0, Lo/doy;->w:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 78
    invoke-static {}, Lo/dpm;->n()Lo/doy;

    move-result-object v0

    iget-object v0, v0, Lo/doy;->w:Ljava/lang/String;

    const-string v1, "full/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    aget-object v1, v5, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "full/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "changelog.xml"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 80
    invoke-direct {p0}, Lo/dpu;->d()Ljava/lang/String;

    move-result-object v7

    .line 81
    const-string v0, "AppPullChangeLogThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Scale Band: current system language="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    iget-object v0, p0, Lo/dpu;->d:Landroid/content/Context;

    invoke-static {v0, v6, v7}, Lo/dpv;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lo/dpv$b;

    move-result-object v4

    .line 83
    goto/16 :goto_0

    .line 84
    :cond_4
    const-string v0, "AppPullChangeLogThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Scale DOWNLOADURL is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    const/4 v4, 0x0

    goto :goto_0

    .line 89
    :cond_5
    invoke-static {}, Lo/dpm;->l()Lo/doy;

    move-result-object v0

    iget-object v0, v0, Lo/doy;->w:Ljava/lang/String;

    if-eqz v0, :cond_6

    .line 90
    invoke-static {}, Lo/dpm;->l()Lo/doy;

    move-result-object v0

    iget-object v0, v0, Lo/doy;->w:Ljava/lang/String;

    const-string v1, "full/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 91
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    aget-object v1, v5, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "full/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "changelog.xml"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 92
    invoke-direct {p0}, Lo/dpu;->d()Ljava/lang/String;

    move-result-object v7

    .line 93
    const-string v0, "AppPullChangeLogThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Band: current system language="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    iget-object v0, p0, Lo/dpu;->d:Landroid/content/Context;

    invoke-static {v0, v6, v7}, Lo/dpv;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lo/dpv$b;

    move-result-object v4

    .line 95
    goto :goto_0

    .line 96
    :cond_6
    const-string v0, "AppPullChangeLogThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DOWNLOADURL is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    const/4 v4, 0x0

    .line 102
    :goto_0
    if-nez v4, :cond_7

    .line 103
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/dpu;->e(ILjava/lang/Object;)V

    goto :goto_1

    .line 105
    :cond_7
    const/4 v5, 0x0

    .line 106
    invoke-virtual {p0, v4}, Lo/dpu;->e(Lo/dpv$b;)Lo/dpv$b$d;

    move-result-object v0

    iput-object v0, p0, Lo/dpu;->a:Lo/dpv$b$d;

    .line 107
    iget-object v0, p0, Lo/dpu;->a:Lo/dpv$b$d;

    if-eqz v0, :cond_8

    .line 108
    iget-object v0, p0, Lo/dpu;->a:Lo/dpv$b$d;

    iget-object v0, v0, Lo/dpv$b$d;->d:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/dpu;->e(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    .line 110
    :cond_8
    if-nez v5, :cond_9

    .line 111
    const-string v0, "AppPullChangeLogThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "changelog is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/dpu;->e(ILjava/lang/Object;)V

    goto :goto_1

    .line 114
    :cond_9
    const-string v0, "AppPullChangeLogThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "changelog is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    const/4 v0, 0x1

    invoke-direct {p0, v0, v5}, Lo/dpu;->e(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    :goto_1
    goto :goto_2

    .line 118
    :catch_0
    move-exception v4

    .line 119
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/dpu;->e(ILjava/lang/Object;)V

    .line 120
    const-string v0, "AppPullChangeLogThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PULL_CHANGE_LOG, Exception : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    :goto_2
    return-void
.end method
