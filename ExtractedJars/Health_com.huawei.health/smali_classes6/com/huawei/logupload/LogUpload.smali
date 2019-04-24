.class public Lcom/huawei/logupload/LogUpload;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/logupload/LogUpload;>;"
        }
    .end annotation
.end field


# instance fields
.field private A:Z

.field private B:I

.field private C:I

.field private D:I

.field private E:Ljava/lang/String;

.field private F:Ljava/lang/String;

.field private G:Ljava/lang/String;

.field private H:Ljava/lang/String;

.field private I:Ljava/lang/String;

.field private J:Ljava/lang/String;

.field private a:Z

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:J

.field private e:J

.field private f:Z

.field private g:Z

.field private h:I

.field private i:I

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Z

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:Ljava/lang/String;

.field private r:Ljava/lang/String;

.field private s:Ljava/lang/String;

.field private t:I

.field private u:I

.field private v:Ljava/lang/String;

.field private w:I

.field private x:J

.field private y:Z

.field private z:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 761
    new-instance v0, Lcom/huawei/logupload/c;

    invoke-direct {v0}, Lcom/huawei/logupload/c;-><init>()V

    sput-object v0, Lcom/huawei/logupload/LogUpload;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 772
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 174
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/logupload/LogUpload;->A:Z

    .line 184
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/logupload/LogUpload;->C:I

    .line 189
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/logupload/LogUpload;->D:I

    .line 17
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 174
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/logupload/LogUpload;->A:Z

    .line 184
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/logupload/LogUpload;->C:I

    .line 189
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/logupload/LogUpload;->D:I

    .line 20
    invoke-virtual {p0, p1}, Lcom/huawei/logupload/LogUpload;->a(Landroid/os/Parcel;)V

    .line 21
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/huawei/logupload/LogUpload;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Lcom/huawei/logupload/LogUpload;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public A()I
    .locals 1

    .line 557
    iget v0, p0, Lcom/huawei/logupload/LogUpload;->w:I

    return v0
.end method

.method public B()J
    .locals 2

    .line 571
    iget-wide v0, p0, Lcom/huawei/logupload/LogUpload;->z:J

    return-wide v0
.end method

.method public C()I
    .locals 1

    .line 585
    iget v0, p0, Lcom/huawei/logupload/LogUpload;->i:I

    return v0
.end method

.method public D()Z
    .locals 1

    .line 599
    iget-boolean v0, p0, Lcom/huawei/logupload/LogUpload;->A:Z

    return v0
.end method

.method public E()Ljava/lang/String;
    .locals 1

    .line 613
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->j:Ljava/lang/String;

    return-object v0
.end method

.method public F()Ljava/lang/String;
    .locals 1

    .line 627
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->k:Ljava/lang/String;

    return-object v0
.end method

.method public G()Z
    .locals 1

    .line 641
    iget-boolean v0, p0, Lcom/huawei/logupload/LogUpload;->y:Z

    return v0
.end method

.method public H()I
    .locals 1

    .line 652
    iget v0, p0, Lcom/huawei/logupload/LogUpload;->B:I

    return v0
.end method

.method public I()I
    .locals 1

    .line 660
    iget v0, p0, Lcom/huawei/logupload/LogUpload;->C:I

    return v0
.end method

.method public J()I
    .locals 1

    .line 668
    iget v0, p0, Lcom/huawei/logupload/LogUpload;->D:I

    return v0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .line 224
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->E:Ljava/lang/String;

    return-object v0
.end method

.method public a(I)V
    .locals 0

    .line 368
    iput p1, p0, Lcom/huawei/logupload/LogUpload;->h:I

    .line 369
    return-void
.end method

.method public a(J)V
    .locals 0

    .line 276
    iput-wide p1, p0, Lcom/huawei/logupload/LogUpload;->x:J

    .line 277
    return-void
.end method

.method public a(Landroid/os/Parcel;)V
    .locals 2

    .line 722
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/logupload/LogUpload;->a:Z

    .line 723
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/logupload/LogUpload;->b:Ljava/lang/String;

    .line 724
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/logupload/LogUpload;->c:Ljava/lang/String;

    .line 725
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/logupload/LogUpload;->d:J

    .line 726
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/logupload/LogUpload;->e:J

    .line 727
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lcom/huawei/logupload/LogUpload;->f:Z

    .line 728
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    iput-boolean v0, p0, Lcom/huawei/logupload/LogUpload;->g:Z

    .line 729
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/logupload/LogUpload;->h:I

    .line 730
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/logupload/LogUpload;->i:I

    .line 731
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/logupload/LogUpload;->j:Ljava/lang/String;

    .line 732
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/logupload/LogUpload;->k:Ljava/lang/String;

    .line 733
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    iput-boolean v0, p0, Lcom/huawei/logupload/LogUpload;->l:Z

    .line 734
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/logupload/LogUpload;->m:Ljava/lang/String;

    .line 735
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/logupload/LogUpload;->n:Ljava/lang/String;

    .line 736
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/logupload/LogUpload;->o:Ljava/lang/String;

    .line 737
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/logupload/LogUpload;->p:Ljava/lang/String;

    .line 738
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/logupload/LogUpload;->q:Ljava/lang/String;

    .line 739
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/logupload/LogUpload;->r:Ljava/lang/String;

    .line 740
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/logupload/LogUpload;->s:Ljava/lang/String;

    .line 741
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/logupload/LogUpload;->t:I

    .line 742
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/logupload/LogUpload;->u:I

    .line 743
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/logupload/LogUpload;->v:Ljava/lang/String;

    .line 744
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/logupload/LogUpload;->w:I

    .line 745
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/logupload/LogUpload;->x:J

    .line 746
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    goto :goto_4

    :cond_4
    const/4 v0, 0x0

    :goto_4
    iput-boolean v0, p0, Lcom/huawei/logupload/LogUpload;->y:Z

    .line 747
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/logupload/LogUpload;->z:J

    .line 748
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x1

    goto :goto_5

    :cond_5
    const/4 v0, 0x0

    :goto_5
    iput-boolean v0, p0, Lcom/huawei/logupload/LogUpload;->A:Z

    .line 749
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/logupload/LogUpload;->B:I

    .line 750
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/logupload/LogUpload;->C:I

    .line 751
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/logupload/LogUpload;->D:I

    .line 752
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/logupload/LogUpload;->E:Ljava/lang/String;

    .line 753
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/logupload/LogUpload;->F:Ljava/lang/String;

    .line 754
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/logupload/LogUpload;->G:Ljava/lang/String;

    .line 755
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/logupload/LogUpload;->H:Ljava/lang/String;

    .line 756
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/logupload/LogUpload;->I:Ljava/lang/String;

    .line 757
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/logupload/LogUpload;->J:Ljava/lang/String;

    .line 758
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 228
    iput-object p1, p0, Lcom/huawei/logupload/LogUpload;->E:Ljava/lang/String;

    .line 229
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 298
    iput-boolean p1, p0, Lcom/huawei/logupload/LogUpload;->a:Z

    .line 299
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->F:Ljava/lang/String;

    return-object v0
.end method

.method public b(I)V
    .locals 0

    .line 494
    iput p1, p0, Lcom/huawei/logupload/LogUpload;->t:I

    .line 495
    return-void
.end method

.method public b(J)V
    .locals 0

    .line 326
    iput-wide p1, p0, Lcom/huawei/logupload/LogUpload;->d:J

    .line 327
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 236
    iput-object p1, p0, Lcom/huawei/logupload/LogUpload;->F:Ljava/lang/String;

    .line 237
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 354
    iput-boolean p1, p0, Lcom/huawei/logupload/LogUpload;->f:Z

    .line 355
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 240
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->G:Ljava/lang/String;

    return-object v0
.end method

.method public c(I)V
    .locals 0

    .line 550
    iput p1, p0, Lcom/huawei/logupload/LogUpload;->u:I

    .line 551
    return-void
.end method

.method public c(J)V
    .locals 0

    .line 340
    iput-wide p1, p0, Lcom/huawei/logupload/LogUpload;->e:J

    .line 341
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 244
    iput-object p1, p0, Lcom/huawei/logupload/LogUpload;->G:Ljava/lang/String;

    .line 245
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 438
    iput-boolean p1, p0, Lcom/huawei/logupload/LogUpload;->g:Z

    .line 439
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 248
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->J:Ljava/lang/String;

    return-object v0
.end method

.method public d(I)V
    .locals 0

    .line 564
    iput p1, p0, Lcom/huawei/logupload/LogUpload;->w:I

    .line 565
    return-void
.end method

.method public d(J)V
    .locals 0

    .line 578
    iput-wide p1, p0, Lcom/huawei/logupload/LogUpload;->z:J

    .line 579
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 252
    iput-object p1, p0, Lcom/huawei/logupload/LogUpload;->J:Ljava/lang/String;

    .line 253
    return-void
.end method

.method public d(Z)V
    .locals 0

    .line 522
    iput-boolean p1, p0, Lcom/huawei/logupload/LogUpload;->l:Z

    .line 523
    return-void
.end method

.method public describeContents()I
    .locals 1

    .line 677
    const/4 v0, 0x0

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 256
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->H:Ljava/lang/String;

    return-object v0
.end method

.method public e(I)V
    .locals 0

    .line 592
    iput p1, p0, Lcom/huawei/logupload/LogUpload;->i:I

    .line 593
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 260
    iput-object p1, p0, Lcom/huawei/logupload/LogUpload;->H:Ljava/lang/String;

    .line 261
    return-void
.end method

.method public e(Z)V
    .locals 0

    .line 606
    iput-boolean p1, p0, Lcom/huawei/logupload/LogUpload;->A:Z

    .line 607
    return-void
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 264
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->I:Ljava/lang/String;

    return-object v0
.end method

.method public f(I)V
    .locals 0

    .line 656
    iput p1, p0, Lcom/huawei/logupload/LogUpload;->B:I

    .line 657
    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 0

    .line 268
    iput-object p1, p0, Lcom/huawei/logupload/LogUpload;->I:Ljava/lang/String;

    .line 269
    return-void
.end method

.method public f(Z)V
    .locals 0

    .line 648
    iput-boolean p1, p0, Lcom/huawei/logupload/LogUpload;->y:Z

    .line 649
    return-void
.end method

.method public g()J
    .locals 2

    .line 272
    iget-wide v0, p0, Lcom/huawei/logupload/LogUpload;->x:J

    return-wide v0
.end method

.method public g(I)V
    .locals 0

    .line 664
    iput p1, p0, Lcom/huawei/logupload/LogUpload;->C:I

    .line 665
    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 0

    .line 312
    iput-object p1, p0, Lcom/huawei/logupload/LogUpload;->b:Ljava/lang/String;

    .line 313
    return-void
.end method

.method public h(I)V
    .locals 0

    .line 672
    iput p1, p0, Lcom/huawei/logupload/LogUpload;->D:I

    .line 673
    return-void
.end method

.method public h(Ljava/lang/String;)V
    .locals 0

    .line 382
    iput-object p1, p0, Lcom/huawei/logupload/LogUpload;->m:Ljava/lang/String;

    .line 383
    return-void
.end method

.method public h()Z
    .locals 1

    .line 291
    iget-boolean v0, p0, Lcom/huawei/logupload/LogUpload;->a:Z

    return v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 305
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->b:Ljava/lang/String;

    return-object v0
.end method

.method public i(Ljava/lang/String;)V
    .locals 0

    .line 396
    iput-object p1, p0, Lcom/huawei/logupload/LogUpload;->n:Ljava/lang/String;

    .line 397
    return-void
.end method

.method public j()J
    .locals 2

    .line 319
    iget-wide v0, p0, Lcom/huawei/logupload/LogUpload;->d:J

    return-wide v0
.end method

.method public j(Ljava/lang/String;)V
    .locals 0

    .line 410
    iput-object p1, p0, Lcom/huawei/logupload/LogUpload;->o:Ljava/lang/String;

    .line 411
    return-void
.end method

.method public k()J
    .locals 2

    .line 333
    iget-wide v0, p0, Lcom/huawei/logupload/LogUpload;->e:J

    return-wide v0
.end method

.method public k(Ljava/lang/String;)V
    .locals 0

    .line 424
    iput-object p1, p0, Lcom/huawei/logupload/LogUpload;->p:Ljava/lang/String;

    .line 425
    return-void
.end method

.method public l(Ljava/lang/String;)V
    .locals 0

    .line 452
    iput-object p1, p0, Lcom/huawei/logupload/LogUpload;->q:Ljava/lang/String;

    .line 453
    return-void
.end method

.method public l()Z
    .locals 1

    .line 347
    iget-boolean v0, p0, Lcom/huawei/logupload/LogUpload;->f:Z

    return v0
.end method

.method public m()I
    .locals 1

    .line 361
    iget v0, p0, Lcom/huawei/logupload/LogUpload;->h:I

    return v0
.end method

.method public m(Ljava/lang/String;)V
    .locals 0

    .line 466
    iput-object p1, p0, Lcom/huawei/logupload/LogUpload;->r:Ljava/lang/String;

    .line 467
    return-void
.end method

.method public n()Ljava/lang/String;
    .locals 1

    .line 375
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->m:Ljava/lang/String;

    return-object v0
.end method

.method public n(Ljava/lang/String;)V
    .locals 0

    .line 480
    iput-object p1, p0, Lcom/huawei/logupload/LogUpload;->s:Ljava/lang/String;

    .line 481
    return-void
.end method

.method public o()Ljava/lang/String;
    .locals 1

    .line 389
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->n:Ljava/lang/String;

    return-object v0
.end method

.method public o(Ljava/lang/String;)V
    .locals 0

    .line 508
    iput-object p1, p0, Lcom/huawei/logupload/LogUpload;->v:Ljava/lang/String;

    .line 509
    return-void
.end method

.method public p()Ljava/lang/String;
    .locals 1

    .line 403
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->o:Ljava/lang/String;

    return-object v0
.end method

.method public p(Ljava/lang/String;)V
    .locals 0

    .line 536
    iput-object p1, p0, Lcom/huawei/logupload/LogUpload;->c:Ljava/lang/String;

    .line 537
    return-void
.end method

.method public q()Ljava/lang/String;
    .locals 1

    .line 417
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->p:Ljava/lang/String;

    return-object v0
.end method

.method public q(Ljava/lang/String;)V
    .locals 0

    .line 620
    iput-object p1, p0, Lcom/huawei/logupload/LogUpload;->j:Ljava/lang/String;

    .line 621
    return-void
.end method

.method public r(Ljava/lang/String;)V
    .locals 0

    .line 634
    iput-object p1, p0, Lcom/huawei/logupload/LogUpload;->k:Ljava/lang/String;

    .line 635
    return-void
.end method

.method public r()Z
    .locals 1

    .line 431
    iget-boolean v0, p0, Lcom/huawei/logupload/LogUpload;->g:Z

    return v0
.end method

.method public s()Ljava/lang/String;
    .locals 1

    .line 445
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->q:Ljava/lang/String;

    return-object v0
.end method

.method public t()Ljava/lang/String;
    .locals 1

    .line 459
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->r:Ljava/lang/String;

    return-object v0
.end method

.method public u()Ljava/lang/String;
    .locals 1

    .line 473
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->s:Ljava/lang/String;

    return-object v0
.end method

.method public v()I
    .locals 1

    .line 487
    iget v0, p0, Lcom/huawei/logupload/LogUpload;->t:I

    return v0
.end method

.method public w()Ljava/lang/String;
    .locals 1

    .line 501
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->v:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 682
    iget-boolean v0, p0, Lcom/huawei/logupload/LogUpload;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 683
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 684
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 685
    iget-wide v0, p0, Lcom/huawei/logupload/LogUpload;->d:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 686
    iget-wide v0, p0, Lcom/huawei/logupload/LogUpload;->e:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 687
    iget-boolean v0, p0, Lcom/huawei/logupload/LogUpload;->f:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 688
    iget-boolean v0, p0, Lcom/huawei/logupload/LogUpload;->g:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 689
    iget v0, p0, Lcom/huawei/logupload/LogUpload;->h:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 690
    iget v0, p0, Lcom/huawei/logupload/LogUpload;->i:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 691
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->j:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 692
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->k:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 693
    iget-boolean v0, p0, Lcom/huawei/logupload/LogUpload;->l:Z

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 694
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->m:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 695
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->n:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 696
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->o:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 697
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->p:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 698
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->q:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 699
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->r:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 700
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->s:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 701
    iget v0, p0, Lcom/huawei/logupload/LogUpload;->t:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 702
    iget v0, p0, Lcom/huawei/logupload/LogUpload;->u:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 703
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->v:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 704
    iget v0, p0, Lcom/huawei/logupload/LogUpload;->w:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 705
    iget-wide v0, p0, Lcom/huawei/logupload/LogUpload;->x:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 706
    iget-boolean v0, p0, Lcom/huawei/logupload/LogUpload;->y:Z

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    goto :goto_4

    :cond_4
    const/4 v0, 0x0

    :goto_4
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 707
    iget-wide v0, p0, Lcom/huawei/logupload/LogUpload;->z:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 708
    iget-boolean v0, p0, Lcom/huawei/logupload/LogUpload;->A:Z

    if-eqz v0, :cond_5

    const/4 v0, 0x1

    goto :goto_5

    :cond_5
    const/4 v0, 0x0

    :goto_5
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 709
    iget v0, p0, Lcom/huawei/logupload/LogUpload;->B:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 710
    iget v0, p0, Lcom/huawei/logupload/LogUpload;->C:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 711
    iget v0, p0, Lcom/huawei/logupload/LogUpload;->D:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 712
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->E:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 713
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->F:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 714
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->G:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 715
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->H:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 716
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->I:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 717
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->J:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 718
    return-void
.end method

.method public x()Z
    .locals 1

    .line 515
    iget-boolean v0, p0, Lcom/huawei/logupload/LogUpload;->l:Z

    return v0
.end method

.method public y()Ljava/lang/String;
    .locals 1

    .line 529
    iget-object v0, p0, Lcom/huawei/logupload/LogUpload;->c:Ljava/lang/String;

    return-object v0
.end method

.method public z()I
    .locals 1

    .line 543
    iget v0, p0, Lcom/huawei/logupload/LogUpload;->u:I

    return v0
.end method
