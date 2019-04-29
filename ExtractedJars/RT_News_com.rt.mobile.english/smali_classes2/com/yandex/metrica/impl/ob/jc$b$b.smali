.class public final Lcom/yandex/metrica/impl/ob/jc$b$b;
.super Lcom/yandex/metrica/impl/ob/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/jc$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field private static volatile m:[Lcom/yandex/metrica/impl/ob/jc$b$b;


# instance fields
.field public b:J

.field public c:J

.field public d:J

.field public e:D

.field public f:D

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2656
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/e;-><init>()V

    .line 2657
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jc$b$b;->e()Lcom/yandex/metrica/impl/ob/jc$b$b;

    return-void
.end method

.method public static d()[Lcom/yandex/metrica/impl/ob/jc$b$b;
    .locals 2

    .line 2612
    sget-object v0, Lcom/yandex/metrica/impl/ob/jc$b$b;->m:[Lcom/yandex/metrica/impl/ob/jc$b$b;

    if-nez v0, :cond_1

    .line 2613
    sget-object v0, Lcom/yandex/metrica/impl/ob/c;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2615
    :try_start_0
    sget-object v1, Lcom/yandex/metrica/impl/ob/jc$b$b;->m:[Lcom/yandex/metrica/impl/ob/jc$b$b;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 2616
    new-array v1, v1, [Lcom/yandex/metrica/impl/ob/jc$b$b;

    sput-object v1, Lcom/yandex/metrica/impl/ob/jc$b$b;->m:[Lcom/yandex/metrica/impl/ob/jc$b$b;

    .line 2618
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 2620
    :cond_1
    :goto_0
    sget-object v0, Lcom/yandex/metrica/impl/ob/jc$b$b;->m:[Lcom/yandex/metrica/impl/ob/jc$b$b;

    return-object v0
.end method


# virtual methods
.method public synthetic a(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/e;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2597
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/jc$b$b;->b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jc$b$b;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/impl/ob/b;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2679
    iget-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->b:J

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(IJ)V

    .line 2680
    iget-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->c:J

    const/4 v2, 0x2

    invoke-virtual {p1, v2, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(IJ)V

    .line 2681
    iget-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->d:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x3

    .line 2682
    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->d:J

    invoke-virtual {p1, v0, v1, v2}, Lcom/yandex/metrica/impl/ob/b;->a(IJ)V

    :cond_0
    const/4 v0, 0x4

    .line 2684
    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->e:D

    invoke-virtual {p1, v0, v1, v2}, Lcom/yandex/metrica/impl/ob/b;->a(ID)V

    const/4 v0, 0x5

    .line 2685
    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->f:D

    invoke-virtual {p1, v0, v1, v2}, Lcom/yandex/metrica/impl/ob/b;->a(ID)V

    .line 2686
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->g:I

    if-eqz v0, :cond_1

    const/4 v0, 0x6

    .line 2687
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->g:I

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->b(II)V

    .line 2689
    :cond_1
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->h:I

    if-eqz v0, :cond_2

    const/4 v0, 0x7

    .line 2690
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->h:I

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->b(II)V

    .line 2692
    :cond_2
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->i:I

    if-eqz v0, :cond_3

    const/16 v0, 0x8

    .line 2693
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->i:I

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->b(II)V

    .line 2695
    :cond_3
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->j:I

    if-eqz v0, :cond_4

    const/16 v0, 0x9

    .line 2696
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->j:I

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(II)V

    .line 2698
    :cond_4
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->k:I

    if-eqz v0, :cond_5

    const/16 v0, 0xa

    .line 2699
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->k:I

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(II)V

    .line 2701
    :cond_5
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->l:I

    if-eqz v0, :cond_6

    const/16 v0, 0xb

    .line 2702
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->l:I

    invoke-virtual {p1, v0, v1}, Lcom/yandex/metrica/impl/ob/b;->a(II)V

    .line 2704
    :cond_6
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/ob/e;->a(Lcom/yandex/metrica/impl/ob/b;)V

    return-void
.end method

.method public b(Lcom/yandex/metrica/impl/ob/a;)Lcom/yandex/metrica/impl/ob/jc$b$b;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2754
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->a()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    .line 2759
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/ob/g;->a(Lcom/yandex/metrica/impl/ob/a;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 2812
    :sswitch_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->g()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 2816
    :pswitch_0
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->l:I

    goto :goto_0

    .line 2801
    :sswitch_1
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->g()I

    move-result v0

    packed-switch v0, :pswitch_data_1

    goto :goto_0

    .line 2806
    :pswitch_1
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->k:I

    goto :goto_0

    .line 2797
    :sswitch_2
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->g()I

    move-result v0

    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->j:I

    goto :goto_0

    .line 2793
    :sswitch_3
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->k()I

    move-result v0

    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->i:I

    goto :goto_0

    .line 2789
    :sswitch_4
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->k()I

    move-result v0

    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->h:I

    goto :goto_0

    .line 2785
    :sswitch_5
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->k()I

    move-result v0

    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->g:I

    goto :goto_0

    .line 2781
    :sswitch_6
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->c()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->f:D

    goto :goto_0

    .line 2777
    :sswitch_7
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->c()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->e:D

    goto :goto_0

    .line 2773
    :sswitch_8
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->e()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->d:J

    goto :goto_0

    .line 2769
    :sswitch_9
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->e()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->c:J

    goto :goto_0

    .line 2765
    :sswitch_a
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/a;->e()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->b:J

    goto :goto_0

    :sswitch_b
    return-object p0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_b
        0x8 -> :sswitch_a
        0x10 -> :sswitch_9
        0x18 -> :sswitch_8
        0x21 -> :sswitch_7
        0x29 -> :sswitch_6
        0x30 -> :sswitch_5
        0x38 -> :sswitch_4
        0x40 -> :sswitch_3
        0x48 -> :sswitch_2
        0x50 -> :sswitch_1
        0x58 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method protected c()I
    .locals 6

    .line 2709
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/e;->c()I

    move-result v0

    .line 2710
    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->b:J

    const/4 v3, 0x1

    .line 2711
    invoke-static {v3, v1, v2}, Lcom/yandex/metrica/impl/ob/b;->c(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 2712
    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->c:J

    const/4 v3, 0x2

    .line 2713
    invoke-static {v3, v1, v2}, Lcom/yandex/metrica/impl/ob/b;->c(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 2714
    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->d:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    const/4 v1, 0x3

    .line 2715
    iget-wide v2, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->d:J

    .line 2716
    invoke-static {v1, v2, v3}, Lcom/yandex/metrica/impl/ob/b;->c(IJ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    const/4 v1, 0x4

    .line 2719
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/b;->d(I)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x5

    .line 2721
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/b;->d(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 2722
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->g:I

    if-eqz v1, :cond_1

    const/4 v1, 0x6

    .line 2723
    iget v2, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->g:I

    .line 2724
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->e(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 2726
    :cond_1
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->h:I

    if-eqz v1, :cond_2

    const/4 v1, 0x7

    .line 2727
    iget v2, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->h:I

    .line 2728
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->e(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 2730
    :cond_2
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->i:I

    if-eqz v1, :cond_3

    const/16 v1, 0x8

    .line 2731
    iget v2, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->i:I

    .line 2732
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->e(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 2734
    :cond_3
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->j:I

    if-eqz v1, :cond_4

    const/16 v1, 0x9

    .line 2735
    iget v2, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->j:I

    .line 2736
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->d(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 2738
    :cond_4
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->k:I

    if-eqz v1, :cond_5

    const/16 v1, 0xa

    .line 2739
    iget v2, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->k:I

    .line 2740
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->d(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 2742
    :cond_5
    iget v1, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->l:I

    if-eqz v1, :cond_6

    const/16 v1, 0xb

    .line 2743
    iget v2, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->l:I

    .line 2744
    invoke-static {v1, v2}, Lcom/yandex/metrica/impl/ob/b;->d(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_6
    return v0
.end method

.method public e()Lcom/yandex/metrica/impl/ob/jc$b$b;
    .locals 2

    const-wide/16 v0, 0x0

    .line 2661
    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->b:J

    .line 2662
    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->c:J

    .line 2663
    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->d:J

    const-wide/16 v0, 0x0

    .line 2664
    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->e:D

    .line 2665
    iput-wide v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->f:D

    const/4 v0, 0x0

    .line 2666
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->g:I

    .line 2667
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->h:I

    .line 2668
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->i:I

    .line 2669
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->j:I

    .line 2670
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->k:I

    .line 2671
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->l:I

    const/4 v0, -0x1

    .line 2672
    iput v0, p0, Lcom/yandex/metrica/impl/ob/jc$b$b;->a:I

    return-object p0
.end method
