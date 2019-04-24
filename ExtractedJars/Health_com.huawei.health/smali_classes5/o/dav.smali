.class public Lo/dav;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/graphics/Bitmap;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:I

.field private e:Ljava/lang/String;

.field private f:I

.field private g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
        }
    .end annotation
.end field

.field private h:Z

.field private i:I

.field private k:Ljava/lang/String;

.field private l:I

.field private m:Ljava/lang/String;

.field private n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/net/Uri;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    sget-object v0, Lo/dae;->O:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dav;->k:Ljava/lang/String;

    .line 122
    iput p1, p0, Lo/dav;->d:I

    .line 123
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 99
    iget v0, p0, Lo/dav;->l:I

    return v0
.end method

.method public a(I)V
    .locals 0

    .line 86
    iput p1, p0, Lo/dav;->i:I

    .line 87
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 154
    iput-object p1, p0, Lo/dav;->c:Ljava/lang/String;

    .line 155
    return-void
.end method

.method public a(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Landroid/net/Uri;>;)V"
        }
    .end annotation

    .line 101
    iput-object p1, p0, Lo/dav;->n:Ljava/util/ArrayList;

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 94
    iget-object v0, p0, Lo/dav;->m:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lo/dav;->m:Ljava/lang/String;

    .line 91
    return-void
.end method

.method public c()I
    .locals 1

    .line 106
    iget v0, p0, Lo/dav;->f:I

    return v0
.end method

.method public c(I)V
    .locals 0

    .line 97
    iput p1, p0, Lo/dav;->l:I

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lo/dav;->e:Ljava/lang/String;

    .line 139
    return-void
.end method

.method public c(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 178
    iput-object p1, p0, Lo/dav;->g:Ljava/util/Map;

    .line 179
    return-void
.end method

.method public d()I
    .locals 1

    .line 82
    iget v0, p0, Lo/dav;->i:I

    return v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 170
    iput-object p1, p0, Lo/dav;->k:Ljava/lang/String;

    .line 171
    return-void
.end method

.method public d(Z)V
    .locals 0

    .line 118
    iput-boolean p1, p0, Lo/dav;->h:Z

    .line 119
    return-void
.end method

.method public e()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Landroid/net/Uri;>;"
        }
    .end annotation

    .line 103
    iget-object v0, p0, Lo/dav;->n:Ljava/util/ArrayList;

    return-object v0
.end method

.method public e(I)V
    .locals 0

    .line 110
    iput p1, p0, Lo/dav;->f:I

    .line 111
    return-void
.end method

.method public e(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 162
    iput-object p1, p0, Lo/dav;->a:Landroid/graphics/Bitmap;

    .line 163
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 146
    iput-object p1, p0, Lo/dav;->b:Ljava/lang/String;

    .line 147
    return-void
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 134
    iget-object v0, p0, Lo/dav;->e:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 142
    iget-object v0, p0, Lo/dav;->b:Ljava/lang/String;

    return-object v0
.end method

.method public h()I
    .locals 1

    .line 126
    iget v0, p0, Lo/dav;->d:I

    return v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 150
    iget-object v0, p0, Lo/dav;->c:Ljava/lang/String;

    return-object v0
.end method

.method public k()Z
    .locals 1

    .line 114
    iget-boolean v0, p0, Lo/dav;->h:Z

    return v0
.end method

.method public l()Landroid/graphics/Bitmap;
    .locals 1

    .line 158
    iget-object v0, p0, Lo/dav;->a:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    .line 166
    iget-object v0, p0, Lo/dav;->k:Ljava/lang/String;

    return-object v0
.end method

.method public o()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
        }
    .end annotation

    .line 174
    iget-object v0, p0, Lo/dav;->g:Ljava/util/Map;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 183
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "shareType = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dav;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "shareTextContent = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dav;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "shareTitleContent = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dav;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "shareUrlContent = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dav;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "sharePicContent = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dav;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "path = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dav;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
