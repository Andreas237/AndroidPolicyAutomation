.class Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

.field private b:[S

.field private c:[B

.field private d:I

.field private e:B

.field private final f:[B

.field private final g:[B

.field private final h:[B

.field private final i:[B

.field private j:B

.field private k:[B

.field private l:B

.field private m:B

.field private n:B

.field private o:B

.field private p:B

.field private q:B

.field private r:S

.field private s:Z

.field private t:Z

.field private u:[I

.field private v:I

.field private w:I

.field private x:I

.field private y:I


# direct methods
.method public constructor <init>(Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;I)V
    .locals 4

    iput-object p1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->e:B

    const/4 v0, 0x4

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->f:[B

    const/4 v0, 0x4

    new-array v0, v0, [B

    fill-array-data v0, :array_1

    iput-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->g:[B

    const/4 v0, 0x4

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    iput-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->h:[B

    const/4 v0, 0x4

    new-array v0, v0, [B

    fill-array-data v0, :array_3

    iput-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->i:[B

    const/16 v0, 0x8

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->j:B

    const/16 v0, 0xff

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->l:B

    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->m:B

    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->n:B

    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->o:B

    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->p:B

    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->q:B

    const/4 v0, 0x0

    iput-short v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->r:S

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->s:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->t:Z

    const/16 v0, 0x9

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->u:[I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->v:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->w:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->x:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->y:I

    iget-object v0, p1, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->t(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p1, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->c(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)I

    goto :goto_0

    :cond_0
    iget-object v0, p1, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->t(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)B

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget-object v0, p1, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->c(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)I

    goto :goto_0

    :cond_1
    iget-object v0, p1, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->t(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)B

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    iget-object v0, p1, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->c(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)I

    goto :goto_0

    :cond_2
    iget-object v0, p1, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->c(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)I

    :goto_0
    iget-object v0, p1, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->v(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)[[I

    move-result-object v0

    iget-object v1, p1, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->w(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v1

    aget-object v0, v0, v1

    const/4 v1, 0x4

    aget v0, v0, v1

    int-to-byte v0, v0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->e:B

    iget-object v0, p1, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->y(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)B

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p1, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->y(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    :cond_3
    iget-object v0, p1, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;Z)Z

    goto :goto_1

    :cond_4
    iget-object v0, p1, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;Z)Z

    :goto_1
    div-int/lit8 v0, p2, 0x2

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->d:I

    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->d:I

    new-array v0, v0, [S

    iput-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->b:[S

    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->d:I

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->c:[B

    invoke-static {p1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;)Landroid/media/AudioRecord;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-static {p1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;)Landroid/media/AudioRecord;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioRecord;->getRecordingState()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_5

    invoke-static {p1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;)Landroid/media/AudioRecord;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->b:[S

    iget v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->d:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Landroid/media/AudioRecord;->read([SII)I

    :cond_5
    return-void

    nop

    :array_0
    .array-data 1
        -0x80t
        0x8t
        -0x78t
        0x0t
    .end array-data

    :array_1
    .array-data 1
        -0x80t
        0x8t
        -0x56t
        0x55t
    .end array-data

    :array_2
    .array-data 1
        -0x3dt
        0x3ct
        -0x34t
        0x33t
    .end array-data

    :array_3
    .array-data 1
        -0x3dt
        0x3ct
        -0x5bt
        0x5at
    .end array-data
.end method

.method private a(S)I
    .locals 4

    const/4 v3, 0x0

    if-lez p1, :cond_0

    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->v:I

    if-gtz v0, :cond_2

    :cond_0
    if-nez p1, :cond_1

    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->v:I

    if-eqz v0, :cond_2

    :cond_1
    if-gez p1, :cond_3

    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->v:I

    if-gez v0, :cond_3

    :cond_2
    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->w:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->w:I

    goto/16 :goto_1

    :cond_3
    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->v:I

    if-eqz v0, :cond_4

    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->w:I

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v1, v1, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->v(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)[[I

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v2, v2, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v2}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->w(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v2

    aget-object v1, v1, v2

    const/4 v2, 0x6

    aget v1, v1, v2

    if-gt v0, v1, :cond_5

    :cond_4
    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->y:I

    iget v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->w:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->y:I

    goto :goto_0

    :cond_5
    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->v:I

    if-lez v0, :cond_6

    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->x:I

    if-gtz v0, :cond_7

    :cond_6
    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->v:I

    if-gez v0, :cond_8

    :cond_7
    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->y:I

    iget v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->w:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->y:I

    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->v:I

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->x:I

    goto :goto_0

    :cond_8
    iget v3, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->y:I

    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->w:I

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->y:I

    iget v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->v:I

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->x:I

    :goto_0
    iput p1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->v:I

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->w:I

    :goto_1
    return v3
.end method

.method private a()V
    .locals 4

    const/4 v3, 0x0

    :goto_0
    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->p:B

    add-int/lit8 v0, v0, -0x1

    if-ge v3, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    add-int/lit8 v2, v3, 0x1

    aget-byte v1, v1, v2

    aput-byte v1, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->p:B

    add-int/lit8 v0, v0, -0x1

    int-to-byte v0, v0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->p:B

    return-void
.end method

.method private a(I)V
    .locals 6

    iget-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->t:Z

    const/4 v1, 0x1

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->u:[I

    iget-byte v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->l:B

    aput p1, v0, v1

    iget-short v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->r:S

    shr-int/lit8 v0, v0, 0x1

    int-to-short v0, v0

    iput-short v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->r:S

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->v(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)[[I

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v1, v1, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->w(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v1

    aget-object v0, v0, v1

    const/4 v1, 0x1

    aget v0, v0, v1

    if-le p1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->v(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)[[I

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v1, v1, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->w(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v1

    aget-object v0, v0, v1

    const/4 v1, 0x2

    aget v0, v0, v1

    if-gt p1, v0, :cond_0

    iget-short v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->r:S

    or-int/lit16 v0, v0, 0x100

    int-to-short v0, v0

    iput-short v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->r:S

    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->q:B

    xor-int/lit8 v0, v0, 0x1

    int-to-byte v0, v0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->q:B

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->v(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)[[I

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v1, v1, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->w(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v1

    aget-object v0, v0, v1

    const/4 v1, 0x0

    aget v0, v0, v1

    if-lt p1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->v(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)[[I

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v1, v1, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->w(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v1

    aget-object v0, v0, v1

    const/4 v1, 0x2

    aget v0, v0, v1

    if-le p1, v0, :cond_2

    :cond_1
    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "R: EN:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->d()V

    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->n:B

    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->m:B

    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->o:B

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->s:Z

    return-void

    :cond_2
    :goto_0
    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "RN:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->l:B

    const/16 v1, 0x8

    if-lt v0, v1, :cond_5

    invoke-direct {p0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->d()V

    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->q:B

    if-eqz v0, :cond_3

    const-string v0, "HWHealthSDK"

    const-string v1, "R: Bit Check error!"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->c()V

    return-void

    :cond_3
    iget-short v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->r:S

    and-int/lit16 v0, v0, 0xff

    int-to-short v0, v0

    iput-short v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->r:S

    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "R: D="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%02X"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-short v4, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->r:S

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    invoke-direct {p0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->e()V

    goto/16 :goto_2

    :cond_4
    invoke-direct {p0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->f()V

    goto/16 :goto_2

    :cond_5
    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->l:B

    add-int/lit8 v0, v0, 0x1

    int-to-byte v0, v0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->l:B

    goto/16 :goto_2

    :cond_6
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_b

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->t(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)B

    move-result v0

    if-nez v0, :cond_b

    iget-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->s:Z

    if-nez v0, :cond_b

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->v(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)[[I

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    const/4 v1, 0x1

    aget v0, v0, v1

    if-le p1, v0, :cond_7

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->v(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)[[I

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    const/4 v1, 0x2

    aget v0, v0, v1

    if-gt p1, v0, :cond_7

    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "RB:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->n:B

    add-int/lit8 v0, v0, 0x1

    int-to-byte v0, v0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->n:B

    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->m:B

    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->o:B

    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->n:B

    const/16 v1, 0xa

    if-lt v0, v1, :cond_a

    const-string v0, "HWHealthSDK"

    const-string v1, "RB X"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->s:Z

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->c(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)I

    goto/16 :goto_1

    :cond_7
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->v(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)[[I

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    const/4 v1, 0x2

    aget v0, v0, v1

    if-le p1, v0, :cond_8

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->v(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)[[I

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    const/4 v1, 0x3

    aget v0, v0, v1

    if-gt p1, v0, :cond_8

    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "RB:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->m:B

    add-int/lit8 v0, v0, 0x1

    int-to-byte v0, v0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->m:B

    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->n:B

    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->o:B

    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->m:B

    const/4 v1, 0x4

    if-lt v0, v1, :cond_a

    const-string v0, "HWHealthSDK"

    const-string v1, "RB M"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->s:Z

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->c(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)I

    goto/16 :goto_1

    :cond_8
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->v(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)[[I

    move-result-object v0

    const/4 v1, 0x2

    aget-object v0, v0, v1

    const/4 v1, 0x2

    aget v0, v0, v1

    if-le p1, v0, :cond_9

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->v(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)[[I

    move-result-object v0

    const/4 v1, 0x2

    aget-object v0, v0, v1

    const/4 v1, 0x3

    aget v0, v0, v1

    if-gt p1, v0, :cond_9

    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "RB:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->o:B

    add-int/lit8 v0, v0, 0x1

    int-to-byte v0, v0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->o:B

    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->n:B

    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->m:B

    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->o:B

    const/4 v1, 0x4

    if-lt v0, v1, :cond_a

    const-string v0, "HWHealthSDK"

    const-string v1, "RB S"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->s:Z

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->c(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)I

    goto :goto_1

    :cond_9
    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->n:B

    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->m:B

    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->o:B

    :cond_a
    :goto_1
    iget-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->s:Z

    if-eqz v0, :cond_f

    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->l:B

    goto/16 :goto_2

    :cond_b
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->v(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)[[I

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v1, v1, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->w(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v1

    aget-object v0, v0, v1

    const/4 v1, 0x0

    aget v0, v0, v1

    if-lt p1, v0, :cond_c

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->v(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)[[I

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v1, v1, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->w(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v1

    aget-object v0, v0, v1

    const/4 v1, 0x1

    aget v0, v0, v1

    if-gt p1, v0, :cond_c

    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->l:B

    add-int/lit8 v0, v0, 0x1

    int-to-byte v0, v0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->l:B

    goto/16 :goto_2

    :cond_c
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->v(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)[[I

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v1, v1, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->w(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v1

    aget-object v0, v0, v1

    const/4 v1, 0x1

    aget v0, v0, v1

    if-le p1, v0, :cond_d

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->v(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)[[I

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v1, v1, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->w(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v1

    aget-object v0, v0, v1

    const/4 v1, 0x2

    aget v0, v0, v1

    if-gt p1, v0, :cond_d

    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->l:B

    const/4 v1, 0x1

    if-lt v0, v1, :cond_d

    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->l:B

    const/4 v1, 0x5

    if-gt v0, v1, :cond_d

    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "RS:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->t:Z

    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->l:B

    const/4 v0, 0x0

    iput-short v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->r:S

    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->q:B

    goto :goto_2

    :cond_d
    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->l:B

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->v(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)[[I

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v1, v1, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->w(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v1

    aget-object v0, v0, v1

    const/4 v1, 0x0

    aget v0, v0, v1

    if-lt p1, v0, :cond_e

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->v(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)[[I

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v1, v1, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->w(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v1

    aget-object v0, v0, v1

    const/4 v1, 0x3

    aget v0, v0, v1

    if-le p1, v0, :cond_f

    :cond_e
    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->n:B

    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->m:B

    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->o:B

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->s:Z

    :cond_f
    :goto_2
    return-void
.end method

.method private b()V
    .locals 5

    const/4 v3, 0x1

    :goto_0
    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->p:B

    if-ge v3, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    aget-byte v0, v0, v3

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_1
    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->p:B

    if-ge v3, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    move v1, v4

    add-int/lit8 v4, v4, 0x1

    iget-object v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    aget-byte v2, v2, v3

    aput-byte v2, v0, v1

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    int-to-byte v0, v4

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->p:B

    return-void
.end method

.method private b(I)V
    .locals 6

    const/4 v3, 0x0

    :goto_0
    if-ge v3, p1, :cond_4

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->b:[S

    aget-short v0, v0, v3

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->b:[S

    add-int/lit8 v2, v3, 0x1

    aget-short v1, v1, v2

    add-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    int-to-short v4, v0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    invoke-static {v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->c(Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;)S

    move-result v1

    or-int/2addr v1, v4

    int-to-short v1, v1

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;S)S

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->c:[B

    and-int/lit16 v1, v4, 0xff

    int-to-byte v1, v1

    aput-byte v1, v0, v3

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->c:[B

    add-int/lit8 v1, v3, 0x1

    shr-int/lit8 v2, v4, 0x8

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->G(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, -0x7d0

    if-lt v4, v0, :cond_0

    add-int/lit16 v0, v4, -0x7d0

    int-to-short v4, v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->H(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x7d0

    if-gt v4, v0, :cond_1

    add-int/lit16 v0, v4, 0x7d0

    int-to-short v4, v0

    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->I(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Z

    move-result v0

    if-nez v0, :cond_2

    div-int/lit8 v0, v4, -0x4

    int-to-short v4, v0

    goto :goto_2

    :cond_2
    div-int/lit8 v0, v4, 0x4

    int-to-short v4, v0

    :goto_2
    invoke-direct {p0, v4}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a(S)I

    move-result v5

    if-eqz v5, :cond_3

    invoke-direct {p0, v5}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a(I)V

    :cond_3
    add-int/lit8 v3, v3, 0x2

    goto/16 :goto_0

    :cond_4
    return-void
.end method

.method private c()V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->p:B

    return-void
.end method

.method private d()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->t:Z

    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->l:B

    return-void
.end method

.method private e()V
    .locals 8

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->y(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)B

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->v(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)[[I

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v1, v1, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->w(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v1

    aget-object v0, v0, v1

    const/4 v1, 0x0

    aget v5, v0, v1

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->v(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)[[I

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v1, v1, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->w(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v1

    aget-object v0, v0, v1

    const/4 v1, 0x2

    aget v6, v0, v1

    const/4 v7, 0x0

    :goto_0
    const/16 v0, 0x9

    if-ge v7, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->u:[I

    aget v0, v0, v7

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v1, v1, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->v(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)[[I

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v2, v2, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v2}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->w(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v2

    aget-object v1, v1, v2

    const/4 v2, 0x1

    aget v1, v1, v2

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->u:[I

    aget v0, v0, v7

    if-ge v0, v6, :cond_1

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->u:[I

    aget v6, v0, v7

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->u:[I

    aget v0, v0, v7

    if-le v0, v5, :cond_1

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->u:[I

    aget v5, v0, v7

    :cond_1
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_2
    sub-int v0, v6, v5

    iget-byte v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->e:B

    div-int/lit8 v1, v1, 0x4

    if-ge v0, v1, :cond_3

    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->e:B

    add-int/lit8 v0, v0, -0x1

    int-to-byte v0, v0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->e:B

    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "RECV Diff: changed to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-byte v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->e:B

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_3
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    iget-byte v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->p:B

    add-int/lit8 v2, v1, 0x1

    int-to-byte v2, v2

    iput-byte v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->p:B

    iget-short v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->r:S

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->p:B

    const/4 v1, 0x4

    if-ne v0, v1, :cond_c

    const/4 v5, 0x0

    const/4 v5, 0x0

    :goto_2
    const/4 v0, 0x4

    if-ge v5, v0, :cond_4

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    aget-byte v0, v0, v5

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->f:[B

    aget-byte v1, v1, v5

    if-ne v0, v1, :cond_4

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_4
    const/4 v0, 0x4

    if-ne v5, v0, :cond_5

    const-string v0, "HWHealthSDK"

    const-string v1, "R: Wave HIGH first"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v4, 0x1

    const/4 v5, 0x0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->y(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)B

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;Z)Z

    goto :goto_4

    :cond_5
    const/4 v5, 0x0

    :goto_3
    const/4 v0, 0x4

    if-ge v5, v0, :cond_6

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    aget-byte v0, v0, v5

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->g:[B

    aget-byte v1, v1, v5

    if-ne v0, v1, :cond_6

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_6
    :goto_4
    const/4 v0, 0x4

    if-ne v5, v0, :cond_7

    const-string v0, "HWHealthSDK"

    const-string v1, "R: Wave HIGH(2) first"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v4, 0x1

    const/4 v5, 0x0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->y(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)B

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;Z)Z

    goto :goto_6

    :cond_7
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->y(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)B

    move-result v0

    if-nez v0, :cond_8

    const/4 v5, 0x0

    :goto_5
    const/4 v0, 0x4

    if-ge v5, v0, :cond_8

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    aget-byte v0, v0, v5

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->h:[B

    aget-byte v1, v1, v5

    if-ne v0, v1, :cond_8

    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_8
    :goto_6
    const/4 v0, 0x4

    if-ne v5, v0, :cond_9

    const-string v0, "HWHealthSDK"

    const-string v1, "R: Wave LOW first"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v4, 0x1

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;Z)Z

    const/4 v5, 0x0

    goto :goto_8

    :cond_9
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->y(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)B

    move-result v0

    if-nez v0, :cond_a

    const/4 v5, 0x0

    :goto_7
    const/4 v0, 0x4

    if-ge v5, v0, :cond_a

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    aget-byte v0, v0, v5

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->i:[B

    aget-byte v1, v1, v5

    if-ne v0, v1, :cond_a

    add-int/lit8 v5, v5, 0x1

    goto :goto_7

    :cond_a
    :goto_8
    const/4 v0, 0x4

    if-ne v5, v0, :cond_b

    const-string v0, "HWHealthSDK"

    const-string v1, "R: Wave LOW(2) first"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v4, 0x1

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;Z)Z

    const/4 v5, 0x0

    :cond_b
    if-nez v4, :cond_c

    invoke-direct {p0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a()V

    :cond_c
    const/4 v0, 0x1

    if-ne v4, v0, :cond_d

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)V

    invoke-direct {p0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->c()V

    :cond_d
    return-void
.end method

.method private f()V
    .locals 11

    const/4 v5, 0x0

    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->p:B

    if-nez v0, :cond_1

    iget-short v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->r:S

    int-to-byte v0, v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const-string v0, "HWHealthSDK"

    const-string v1, "F: S"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    iget-byte v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->p:B

    add-int/lit8 v2, v1, 0x1

    int-to-byte v2, v2

    iput-byte v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->p:B

    iget-short v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->r:S

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    const/16 v0, 0x8

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->j:B

    :cond_0
    return-void

    :cond_1
    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "F:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-byte v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->p:B

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    iget-byte v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->p:B

    add-int/lit8 v2, v1, 0x1

    int-to-byte v2, v2

    iput-byte v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->p:B

    iget-short v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->r:S

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->p:B

    const/16 v1, 0x8

    if-ne v0, v1, :cond_2

    iget-short v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->r:S

    const/16 v1, 0xff

    if-ge v0, v1, :cond_2

    iget-short v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->r:S

    const/16 v1, 0x8

    if-le v0, v1, :cond_2

    iget-short v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->r:S

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    iput-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->j:B

    :cond_2
    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->p:B

    iget-byte v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->j:B

    if-ge v0, v1, :cond_3

    return-void

    :cond_3
    iget-short v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->r:S

    int-to-byte v0, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_4

    invoke-direct {p0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->b()V

    return-void

    :cond_4
    const/4 v6, 0x0

    :goto_0
    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->j:B

    if-ge v6, v0, :cond_5

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    aget-byte v0, v0, v6

    xor-int/2addr v0, v5

    int-to-byte v5, v0

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_5
    if-eqz v5, :cond_6

    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "F XOR ERR! CRC="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->b()V

    return-void

    :cond_6
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->z(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v1, 0x2

    aget-byte v0, v0, v1

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v1, 0x2

    aget-byte v0, v0, v1

    const/16 v1, 0x10

    if-eq v0, v1, :cond_7

    const-string v0, "HWHealthSDK"

    const-string v1, "F sequence ERR!"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->c()V

    return-void

    :cond_7
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->z(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->A(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)B

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_9

    :cond_8
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->z(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Z

    move-result v0

    if-nez v0, :cond_a

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v1, 0x4

    aget-byte v0, v0, v1

    const/4 v1, -0x1

    if-eq v0, v1, :cond_a

    :cond_9
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v1, 0x1

    aget-byte v0, v0, v1

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v2, 0x2

    aget-byte v1, v1, v2

    add-int/2addr v0, v1

    int-to-byte v5, v0

    const/4 v6, 0x4

    :goto_1
    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->j:B

    add-int/lit8 v0, v0, -0x1

    if-ge v6, v0, :cond_a

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    aget-byte v0, v0, v6

    add-int/2addr v0, v5

    int-to-byte v5, v0

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_a
    if-eqz v5, :cond_b

    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "F SUM ERR! CRC="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->b()V

    return-void

    :cond_b
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v1, 0x2

    aget-byte v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_7

    :pswitch_0
    iget-byte v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->j:B

    const/16 v1, 0x8

    if-ne v0, v1, :cond_12

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v1, 0x6

    aget-byte v0, v0, v1

    and-int/lit8 v0, v0, 0x20

    if-nez v0, :cond_c

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->z(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Z

    move-result v0

    if-nez v0, :cond_d

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v1, 0x4

    aget-byte v0, v0, v1

    const/4 v1, -0x1

    if-eq v0, v1, :cond_d

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v2, 0x4

    aget-byte v1, v1, v2

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;B)B

    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "F: dev ver="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v2, v2, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v2}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->A(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)B

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_c
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v1, 0x4

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    int-to-short v6, v0

    if-lez v6, :cond_d

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    add-int/lit8 v1, v6, 0x64

    int-to-float v1, v1

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;F)F

    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "F: V="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v2, v2, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v2}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->B(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_d
    :goto_2
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v1, 0x6

    aget-byte v0, v0, v1

    and-int/lit8 v0, v0, 0x10

    if-nez v0, :cond_e

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->z(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Z

    move-result v0

    if-nez v0, :cond_f

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v1, 0x4

    aget-byte v0, v0, v1

    const/4 v1, -0x1

    if-eq v0, v1, :cond_f

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v2, 0x5

    aget-byte v1, v1, v2

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;B)B

    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "F: Protocol ver="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v2, v2, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v2}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->C(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)B

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    :cond_e
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v1, 0x6

    aget-byte v0, v0, v1

    int-to-short v0, v0

    shl-int/lit8 v0, v0, 0x8

    and-int/lit16 v0, v0, 0x300

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v2, 0x5

    aget-byte v1, v1, v2

    int-to-short v1, v1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    int-to-short v6, v0

    if-lez v6, :cond_f

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    add-int/lit8 v1, v6, -0x1

    int-to-float v1, v1

    const/high16 v2, 0x41200000    # 10.0f

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;F)F

    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "F: T="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v2, v2, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v2}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->D(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_f
    :goto_3
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v1, 0x6

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_10

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)V

    goto/16 :goto_7

    :cond_10
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v1, 0x6

    aget-byte v0, v0, v1

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_11

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/16 v1, 0xb

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)V

    goto/16 :goto_7

    :cond_11
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1d

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)V

    goto/16 :goto_7

    :cond_12
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v2, 0x4

    aget-byte v1, v1, v2

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;B)B

    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "F: dev ver="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v2, v2, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v2}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->A(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)B

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v2, 0x5

    aget-byte v1, v1, v2

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;B)B

    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "F: Protocol ver="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v2, v2, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v2}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->C(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)B

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/16 v1, 0x8

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    int-to-short v6, v0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    add-int/lit8 v1, v6, 0x64

    int-to-float v1, v1

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;F)F

    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "F: V="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v2, v2, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v2}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->B(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v1, 0x6

    aget-byte v0, v0, v1

    and-int/lit8 v0, v0, 0x1

    shl-int/lit8 v0, v0, 0x8

    int-to-short v0, v0

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/16 v2, 0x9

    aget-byte v1, v1, v2

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    int-to-short v7, v0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    int-to-float v1, v7

    const/high16 v2, 0x41200000    # 10.0f

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;F)F

    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "F: T="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v2, v2, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v2}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->D(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/16 v2, 0xa

    aget-byte v1, v1, v2

    and-int/lit16 v1, v1, 0xff

    iget-object v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/16 v3, 0xb

    aget-byte v2, v2, v3

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v1, v2

    iget-object v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/16 v3, 0xc

    aget-byte v2, v2, v3

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v1, v2

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->d(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)I

    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "F: swVer="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v2, v2, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v2}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->E(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "0123456789ABCDEF"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v0, ""

    invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v10, 0x0

    :goto_4
    const/16 v0, 0xa

    if-ge v10, v0, :cond_13

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    rsub-int/lit8 v1, v10, 0x16

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xf0

    shr-int/lit8 v0, v0, 0x4

    aget-char v0, v8, v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    rsub-int/lit8 v1, v10, 0x16

    aget-byte v0, v0, v1

    and-int/lit8 v0, v0, 0xf

    aget-char v0, v8, v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    :cond_13
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "F: SN="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v2, v2, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v2}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->o(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v1, 0x6

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_14

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)V

    goto :goto_5

    :cond_14
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v1, 0x6

    aget-byte v0, v0, v1

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_15

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/16 v1, 0xb

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)V

    goto :goto_5

    :cond_15
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_16

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)V

    :cond_16
    :goto_5
    goto/16 :goto_7

    :pswitch_1
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v1, 0x4

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v2, 0x5

    aget-byte v1, v1, v2

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v2, 0x6

    aget-byte v1, v1, v2

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int v6, v0, v1

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const-string v1, "%07d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "F: SN="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v2, v2, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v2}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->o(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_7

    :pswitch_2
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v2, 0x4

    aget-byte v1, v1, v2

    and-int/lit16 v1, v1, 0xff

    iget-object v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v3, 0x5

    aget-byte v2, v2, v3

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v1, v2

    iget-object v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v3, 0x6

    aget-byte v2, v2, v3

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v1, v2

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->d(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)I

    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "F: swVer="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v2, v2, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v2}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->E(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_7

    :pswitch_3
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v1, 0x4

    aget-byte v0, v0, v1

    if-nez v0, :cond_18

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v1, 0x5

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    int-to-short v7, v0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->A(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)B

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_17

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    add-int/lit8 v1, v7, 0x64

    int-to-float v1, v1

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;F)F

    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Frame: Voltage="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v2, v2, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v2}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->B(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v1, 0x6

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    int-to-short v8, v0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    mul-int/lit8 v1, v8, 0x2

    int-to-float v1, v1

    const/high16 v2, 0x41200000    # 10.0f

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;F)F

    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "F: T="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v2, v2, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v2}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->D(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_17
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)V

    goto/16 :goto_7

    :cond_18
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/4 v1, 0x5

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)V

    goto/16 :goto_7

    :pswitch_4
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/4 v1, 0x6

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)V

    goto/16 :goto_7

    :pswitch_5
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/4 v1, 0x7

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)V

    goto/16 :goto_7

    :pswitch_6
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v1, 0x4

    aget-byte v0, v0, v1

    if-nez v0, :cond_19

    goto/16 :goto_7

    :cond_19
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v1, 0x4

    aget-byte v0, v0, v1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1a

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/16 v1, 0x9

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)V

    goto/16 :goto_7

    :cond_1a
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v1, 0x4

    aget-byte v0, v0, v1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1b

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)V

    goto/16 :goto_7

    :cond_1b
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v1, 0x4

    aget-byte v0, v0, v1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1d

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v1, 0x6

    aget-byte v0, v0, v1

    int-to-short v0, v0

    shl-int/lit8 v0, v0, 0x8

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v2, 0x5

    aget-byte v1, v1, v2

    int-to-short v1, v1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    int-to-short v7, v0

    if-nez v7, :cond_1c

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/16 v1, 0xc

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)V

    goto :goto_6

    :cond_1c
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/16 v1, 0xd

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)V

    :goto_6
    goto :goto_7

    :pswitch_7
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v1, 0x5

    aget-byte v0, v0, v1

    int-to-short v0, v0

    shl-int/lit8 v0, v0, 0x8

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v2, 0x4

    aget-byte v1, v1, v2

    int-to-short v1, v1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    int-to-short v7, v0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    and-int/lit16 v1, v7, 0x7fff

    int-to-float v1, v1

    const/high16 v2, 0x41200000    # 10.0f

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->c(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;F)F

    const-string v0, "HWHealthSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "F: Glucose="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v2, v2, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    invoke-static {v2}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->F(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;)F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->k:[B

    const/4 v2, 0x6

    aget-byte v1, v1, v2

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->c(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;B)B

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/16 v1, 0x8

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)V

    :cond_1d
    :goto_7
    :pswitch_8
    invoke-direct {p0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->c()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_7
        :pswitch_3
        :pswitch_5
        :pswitch_4
        :pswitch_8
        :pswitch_6
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method public run()V
    .locals 5

    const-string v0, "HWHealthSDK"

    const-string v1, "AudRec: thread started!"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;)Landroid/media/AudioRecord;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;)Landroid/media/AudioRecord;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioRecord;->getRecordingState()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const-string v0, "HWHealthSDK"

    const-string v1, "AudRec: can\'t record, released"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;)Landroid/media/AudioRecord;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioRecord;->release()V

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;Landroid/media/AudioRecord;)Landroid/media/AudioRecord;

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    iget-object v0, v0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest;

    const/16 v1, 0xf

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest;I)V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;)Landroid/media/AudioRecord;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;)Landroid/media/AudioRecord;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioRecord;->getRecordingState()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;)Landroid/media/AudioRecord;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->b:[S

    iget v2, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->d:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Landroid/media/AudioRecord;->read([SII)I

    move-result v4

    const/4 v0, -0x3

    if-ne v0, v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-direct {p0, v4}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->b(I)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;)Landroid/media/AudioRecord;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v0, "HWHealthSDK"

    const-string v1, "AudRec: released"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    invoke-static {v0}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->b(Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;)Landroid/media/AudioRecord;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioRecord;->release()V

    iget-object v0, p0, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b$a;->a:Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;->a(Lcom/huawei/dnurse/sdk/DnurseDeviceTest$b;Landroid/media/AudioRecord;)Landroid/media/AudioRecord;

    :cond_3
    return-void
.end method
