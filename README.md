# Tecnologias utilizadas

- Linguagem:
    - Java 11
    
- ORM
    - Spring Data JPA
    - Spring Web
    - Spring Boot DevTools
    - H2 Database
    - MySQL Driver
    - Hibernate
    - Lombok

- Nuvem
    - AWS S3 -Upload de imagens
    - AWS Elasticbeanstalk - Deploy
    - AWS RDS MYSQL - Banco de dados
    - Heroku - Deploy
    
- Banco de dados
    - H2
    - MYSQL

### Links Back-End:

#### [Link Documentação da API](https://notch-tiglon-21b.notion.site/Amar-e-Cuidar-Cosm-ticos-ba030697b4014482acbc9c077bc6eded)

#### [Link da API no Heroku](https://ctd-ecommerce-api.herokuapp.com)

#### [Link da API no AWS Elastic Beanstalk](http://turmadoisgrupodois-env.eba-e8scz79c.us-east-1.elasticbeanstalk.com)

    
    ## Prototipação do banco H2
    
    ```sql
    
    create table category (id bigint generated by default as identity, name varchar(255), primary key (id));
    create table product (id bigint generated by default as identity, shortdescription varchar(255), fulldescription text, image varchar(255), price double, avaliacao double, num_avaliacao int, title varchar(255), category_id bigint, primary key (id));
    alter table product add constraint Ecomerce foreign key (category_id) references category;
    
    INSERT INTO category (id, name) VALUES ( null, 'Hair Care');
    INSERT INTO category (id, name) VALUES ( null, 'Make Up');
    INSERT INTO category (id, name) VALUES ( null, 'Veganos');
    INSERT INTO category (id, name) VALUES ( null, 'Perfumes');
    INSERT INTO category (id, name) VALUES ( null, 'Skin Care');
    
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'Soin Kérastase', 4.5, 245, 141.00, 1, 'Condicionador Kérastase Elixir Ultime Le Fondant.', 'Condicionador para tratamento dos fios composto por óleo de camélia, proporcionando um brilho radiante e duradouro. Combinação única de 5 óleos preciosos. Óleo de Marula: Enriquecido com vitaminas C e D, proporciona uma nutrição intensa, proteção antioxidante para proporcionar aos seus cabelos os nutrientes essenciais. Óleo de Camélia: Ajuda a suavizar a fibra capilar com um resultado de brilho incrível. Óleo de Gérmen de Milho: Um ingrediente ativo que tem função importante para nutrição e proteção. Óleo de Pracaxi: Fornece brilho, nutrição e maciez aos fios. Óleo de Argan: Ajuda a restaurar a força dos fios e protege das agressões externas.', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/hair_care/condicionador-kerastase.jpg');
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'Bain Kerastase', 4.0, 120, 99.00, 1, 'Shampoo Kérastase Elixir Ultime Le Bain.', 'Shampoo de limpeza composto por óleo de camélia e óleo de Marula que remove impurezas e purifica o cabelo, proporcionando um brilho radiante e duradouro. Combinação única de 5 óleos preciosos. Óleo de Marula: Enriquecido com vitaminas C e D, proporciona uma nutrição intensa, proteção antioxidante para proporcionar aos seus cabelos os nutrientes essenciais. Óleo de Camélia: Ajuda a suavizar a fibra capilar com um resultado de brilho incrível. Óleo de Gérmen de Milho: Um ingrediente ativo que tem função importante para nutrição e proteção. Óleo de Pracaxi: Fornece brilho, nutrição e maciez aos fios. Óleo de Argan: Ajuda a restaurar a força dos fios e protege das agressões externas.', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/hair_care/shampoo-elixir.jpg');
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'Masque Kérastase', 5.0, 35, 249.00, 1, 'Máscara de Tratamento Kérastase Elixir Ultime Le Masque.', 'Máscara para tratamento profundo dos fios composta por óleo de camélia e óleo de Marula, proporcionando um brilho radiante e duradouro. Combinação única de 5 óleos preciosos. Óleo de Marula: Enriquecido com vitaminas C e D, proporciona uma nutrição intensa, proteção antioxidante para proporcionar aos seus cabelos os nutrientes essenciais. Óleo de Camélia: Ajuda a suavizar a fibra capilar com um resultado de brilho incrível. Óleo de Gérmen de Milho: Um ingrediente ativo que tem função importante para nutrição e proteção. Óleo de Pracaxi: Fornece brilho, nutrição e maciez aos fios. Óleo de Argan: Ajuda a restaurar a força dos fios e protege das agressões externas.', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/hair_care/creme-elixir.jpg');
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'Gel Modelador Keune', 4.8, 210, 98.00, 1, 'Gel Modelador Keune 1922 Classic Gel.', 'Gel modelador de alta fixação, 1922 Classic Gel é indicado para cabelos médios e curtos e penteados que necessitem de alta fixação e brilho. Sua fórmula contém creatina e óleo de rícino, um poderoso fortificante natural com propriedades hidratantes. Deixa qualquer penteado no lugar, com toque extra de brilho. Adequado para cabelos médios e curtos. Penteados que necessitem de alta fixação e brilho. ', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/hair_care/gel-keune.jpg');
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'Shampoo Keune', 4.2, 463, 34.50, 1, 'Shampoo Neutro Keune 1922 Refreshing Shampoo.', 'O 1922 Refreshing Shampoo é um shampoo neutro de uso diário recomendado para todos os tipos de cabelo que proporciona uma agradável sensação de frescor e é ideal para quem mora em regiões quentes ou pratica esportes. O frescor desse shampoo vem da fórmula, rica em extrato de hortelã, pimenta e mentol. Adequado para higienizar qualquer tipo de cabelo, promovendo uma agradável sensação de frescor. Suas propriedades mentoladas proporcionam ao couro cabeludo uma sensação de limpeza e frescor, estimulando a circulação sanguínea.', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/hair_care/shampoo-keune.jpg');
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'Shampoo Redken', 4.6, 310, 99.00, 1, 'Redken Brews 3-In-1 - Shampoo Multifuncional.', 'O Shampoo Redken Brews 3 em 1 promove limpeza e deixa seus fios de seus cabelos macios e fáceis de pentear. É 3 em 1 pelo fato de poder ser aplicado tanto nos cabelos, na barba e no corpo. Resultado esperado: Pele e cabelos hidratados e relaxados. Indicado: Para todos os tipos de cabelo, barba e pele. Tecnologia: Possui uma fórmula antirressecamento à base de malte. Tem ação relaxante, promove hidratação e limpeza e tratamento profissional para os seus cabelos.', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/hair_care/shampoo-redken.jpg');
    
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'Batom Clinique', 4.8, 145, 54.00, 2, 'Batom Clinique Even Better Pop Bare Lip.', 'Uma paleta de tons de boca neutros que favorecem o tom e o subtom da pele. O QUE FAZ: Descubra sua individualidade usando o Clinique Shade-Match Science™. Com base em um algoritmo exclusivo, podemos fornecer tons que complementam o tom e o subtom da sua pele. Use a Roleta da Ciência do Clinique Shade-Match para descobrir seus tons perfeitos para três looks diferentes: Naked, Casual e Glam.', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/make_up/batom-clinique.jpg');
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'Batom MAC', 4.6, 221, 99.00, 2, 'Batom de longa duração. O produto icônico que tornou a M·A·C famosa.', 'M·A·C Lipstick – o produto icônico que tornou a M·A·C famosa. Fórmula de longa duração que proporciona cor intensamente pigmentada e acabamento ultra matte aveludado.', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/make_up/batom-mac.jpg');
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'Corretivo Líquido Dior', 4.9, 15, 255.00, 2, 'Dior Forever Skin Correct.Corretivo com duração 24h e Tratamento Extremo.', 'Dior cria Forever Skin Correct, corretivo com duração 24h e tratamento extremo. Numa só passagem este corretivo multiusos esconde olheiras, pequenas vermelhidões, manchas e imperfeições sem marcar os traços, para uma tez perfeita de manhã até à noite. Este concentrado de tratamento com duração 24H* é enriquecido com extrato de amor-perfeito silvestre para uma pele hidratada, suavizada com aparência refinada. A qualidade da tez é aperfeiçoada dia após dia.', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/make_up/corretivo-dior.jpg');
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'Paleta de sombra MAC', 4.4, 150, 199.00, 2, 'Mac Eye Shadow X9 Dusky Rose Times Nine.', 'Tenha um olhar delicado e fashion com esta paleta. Seus tons de rosa escuro, perfeitamente combinados, duram horas. Com diversas texturas, de matte à acetinada ou cintilante, crie uma variedade de looks para o dia e para a noite. As sombras super pigmentadas vêm em uma compacta embalagem portátil.', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/make_up/paleta-mac.jpg');
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'Paleta de sombra Urban Decay', 4.3, 13, 369.00, 2, 'Paleta de sombras Naked 3 Urban Decay.', 'O Estojo de Sombras Naked 3 é um item essencial para as amantes das sombras de cores neutras. Ele possui uma seleção especial de cores, para você criar infinitas possibilidades de makes para todas as ocasiões. Suas 12 cores são super pigmentadas com acabamento cintilante ao fosco, passando ainda pelos metálicos.', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/make_up/paletanaked.jpg');
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'Paleta de Sombra NYX', 4.9, 210, 149.00, 2, 'Paleta de sombras de dezesseis cores NYX Professional Ultimate – Phoenix.', 'Uma paleta de sombras de dezesseis cores. Obtenha todos os seus brilhos em um só lugar com a NYX Professional Makeup Ultimate Shadow Palette Phoenix. Esta paleta apresenta dezesseis sombras em tons quentes para você experimentar e criar novos looks. A paleta de nível profissional tem uma fórmula macia e finamente moída que desliza para a tampa e se mistura como nenhuma outra. Com uma mistura de acabamentos mate e cintilante, as possibilidades com esta paleta são infinitas. Cruelty-free.', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/make_up/paleta-nyx.jpg');
    
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'Batom Baims', 4.7, 318, 59.00, 3, 'Batom orgânico, 100% natural e vegano, sem corantes artificiais.', 'O Batom de Baims é orgânico, 100% natural e vegano, sem corantes artificiais. É elaborado com óleos vegetais de buriti e rícino que deixam os lábios suaves, macios e profundamente hidratados, previnem o ressecamento e protegem os lábios contra os danos do sol, vento e frio.', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/veganos/batom-balms.jpg');
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'Shampoo em barra Lush', 4.8, 189, 89.00, 3, 'Shampoo para cabelos opacos. Feito com óleo de limão siciliano, suco de limão e azeitonas frescas.', 'Atenção, cabelo opaco! Montalbano está na área. Feito com óleo de limão siciliano, suco de limão e azeitonas frescas, ele fará o cabelo brilhar como um diamante da raiz às pontas. Nossos inventores também adicionaram alecrim a esta espuma para ajudar a manter o couro cabeludo irritado acalmado, enquanto deixa o cabelo com cheiro de um pomar de frutas cítricas com um toque de ervas. Uma barra substitui até três frascos de 250ml de xampu líquido.', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/veganos/shampoo-lush.jpg');
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'Máscara Facial Lush', 4.9, 88, 99.00, 3, 'Máscara que acalma delicadamente a pele e restaura o equilíbrio.', 'Máscara fresca maravilhosamente calmante. Uma mistura simples de caulim, calamina e óleo de rosa turco acalma delicadamente a pele e restaura o equilíbrio. Se você está se sentindo quente e incomodado ou apenas adora regar sua pele com rosas, a limpeza de calamina e caulim removerá suavemente a sujeira enquanto o óleo de rosa requintado nutre e tonifica seu rosto. Pele calma e fosca, aí vem!', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/veganos/face-mask-lush.jfif');
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'Rejuvenescedor Facial Acure', 4.4, 80, 75.00, 3, 'Sérum facial com Bakuchiol de fase dupla 20ml.', 'Ampola Dual-Phase exclusiva com berinjela calmante e rejuvenescedora, açafrão, manjericão sagrado e bakuchiol - uma alternativa de retinol à base de plantas. A camada superior é uma essência rica em antioxidantes e a inferior é uma mistura de soro hidratante. 100% Vegan. Paraben Free. Sulfate Free. Mineral Oil Free. Petrolatum Free. Formaldehyde Free. Cruelty Free.', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/veganos/rejuvenecedor-acure.jpg');
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'Shampoo Energizante Acure', 4.9, 151, 44.00, 3, 'Shampoo antioxidante para cabelos super estressados.', 'Shampoo antioxidante para cabelos super estressados. Ervas adaptogênicas e cogumelos como ashwagandha, manjericão sagrado, cogumelo reishi e açafrão combinam com espinafre superverde, couve e espirulina para iluminar e reenergizar seu cabelo. Acreditamos que o bem-estar do cabelo significa ajudar seu cabelo a prosperar com hidratação calmante e ingredientes botânicos. 100% vegano. Sem parabenos, sem sulfato, sem óleo mineral, sem petróleo, sem formaldeído, sem crueldade.', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/veganos/shampoo-acure.jpg');
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'Loção Capilar Weleda', 4.2, 361, 129.00, 3, 'Loção Capilar Revitalizante de Rosmarinus. Fios fortes, nutridos e com menos queda 100ml.', 'O produto mais antigo da Weleda. Promove um cuidado natural que ajuda a diminuir a queda de cabelo e auxilia no crescimento de fios fortes e espessos. Fortalece os fios, revigora o couro cabeludo e nutre a raiz do cabelo, ajudando a reduzir a queda e promover o crescimento de fios mais fortes e espessos. Sua fragrância de Alecrim é adequada para homens e mulheres. Dermatologicamente testado. Livre de fragrâncias artificiais, matérias-primas derivadas de óleos minerais, corantes e conservantes sintéticos. Com tensoativos biodegradáveis.Produto não testado em animais.', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/veganos/shampoo-weleda.jpg');
    
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'Rose Tangerine', 5.0, 46, 499.00, 4, 'Perfume Chloé Rose Tangerine Eau De Toilette 50ml.', 'Rose Tangerine traz a icônica nota da linha Chloé: uma rosa radiante, fresca e límpida, que faz parte da identidade das fragrâncias da marca. Nessa nova versão, a nota da clássica rosa é surpreendentemente inspirada pelo toque frutado da vibrante e ensolarada essência de tangerina, acrescentando mais brilho à composição, enquanto o luminoso cassis, com suas nuances verdes, potencializa a assinatura da fragrância. As notas de fundo são compostas pelo requinte da madeira de cedro e pela sensualidade do âmbar branco, que trazem à tona uma elegância contemporânea e aerodinâmica.', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/perfumes/cloe.jpg');
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'Dior Homme', 5.0, 39, 579.00, 4, 'Perfume Dior Homme Masculino Eau De Toilette 100ml.', 'Dior Homme cumpre todas as promessas de uma masculinidade intensamente amadeirada que envolve e reveste, deixando uma impressão de longo curso. Uma nova sensualidade masculina que se redefine numa polifonia de madeira simultaneamente bruta e suave. Um coração de madeiras suaves, onde a virilidade do cedro do Atlas abraça o calor envolvente da madeira de Caxemira. Um perfume de aura vincada que deixa uma impressão sensual.', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/perfumes/dior-homme.jpg');
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'Sauvage', 4.9, 86, 565.00, 4, 'Perfume Dior Sauvage Masculino Eau De Parfum 60ml.', 'François Demachy, perfumista-Criador de Dior, inspirou-se no deserto, na hora mágica do crepúsculo. Misturado com a frieza da noite, o ar ardente do deserto exala fragrâncias profundas. Na hora em que os lobos saem e o céu é incendiado, uma nova magia se desenrola. A bergamota da Calábria, tão suculenta e espirituosa como sempre, convida novas notas picantes a aumentar a plenitude e a sensualidade, já que o rastro ambarado do Ambroxan® está envolto nos acentos esfumados do absoluto da baunilha de Papua Nova Guiné, para maior virilidade.', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/perfumes/dior-sauvage.jpg');
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'J''adore', 5.0, 76, 569.00, 4, 'Perfume J''adore Dior Feminino Eau De Parfum 50ml.', 'J''adore eau de parfum é a grande fragrância floral feminina da Dior. Um buquê finamente trabalhado até o último detalhe, como uma flor feita sob medida. A essência do ylang-ylang, com suas notas florais e frutadas, e a essência da Rosa Damascena da Turquia, misturam-se com uma rara dupla de Jasmine Grandiflorum de Grasse e indiano Sambac Jasmine com sensualidade frutada e voluptuosa.', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/perfumes/jadore.jpg');
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'La Vie Est Belle', 4.9, 143, 499.00, 4, 'Perfume Lancôme La Vie Est Belle Feminino 50ml.', 'Pela primeira vez, Anne Flipo, Olivier Polge e Ropion Dominique - três dos maiores perfumistas franceses - uniram seus talentos para compor uma fragrância excepcional cujo diferencial está na simplicidade. Afinal, menos é mais. Depois de 5.521 combinações, eles formularam um perfume com apenas 63 ingredientes, sendo quase metade deles de origem natural.', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/perfumes/la-vie-est-belle.jpg');
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'Prada L''homme', 5.0, 29, 749.00, 4, 'Perfume Prada L''homme Masculino Eau De Parfum 150ml.', 'Os códigos clássicos da masculinidade estão presentes nas notas mais frescas e aromáticas. A ambiguidade está presente nas notas ambaradas das resinas. É uma mistura tanto aérea quanto sensual. Pirâmide Olfativa: Notas de topo: Gerânio Fresco. Notas de coração: Pimenta Picante Preta. Notas de fundo: Patchouli Fresco.', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/perfumes/prada-homme.jpg');
    
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'Cera De Barba Keune', 4.6, 186, 250.00, 5, 'Cera de barba Keune 1922 Beard Balm 75ml.', '1922 Beard Balm é uma cera com textura de balm indicada para dar maciez, alinhamento e maleabilidade à barba enquanto proporciona pouco brilho e pouca fixação. Sua fórmula é enriquecida com ingredientes naturais que hidratam e nutrem essa parte do rosto.  Adequado para dar maciez, alinhamento e maleabilidade à barba. Contém ingredientes que hidratam e nutrem a barba, melhorando o aspecto de maciez e facilitando a modelagem.', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/skin_care/cera-keune.jpg');
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'Creme Firmador Cashmere ', 5.0, 88, 399.00, 5, 'Creme Cashmere firmador Caudalie Resveratrol-Lift 50ml.', 'Um creme hidratante firmador diário potencializado pela combinação patenteada de Resveratrol da vinha, ácido hialurônico e nossa alternativa vegana ao colágeno. Com fórmula potencializada pela exclusiva patente Caudalie de Resveratrol da vinha + ácido hialurônico + alternativa vegana ao colágeno, o Creme Cashmere trata as rugas, nutre, firma e preenche a pele. Sua fórmula é enriquecida com pós minerais para iluminar instantaneamente a pele. Formulado com mais de 97% de ingredientes sensoriais de origem natural, esse creme rico em fosfolipídios é tão suave como cashmere sobre a pele. O seu complexo fitoaromático deixa a pele delicadamente perfumada com notas de manjericão, citronela, camomila, tomilho e flor de laranjeira.', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/skin_care/creme-caudalie.jpg');
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'Gel de barbear Acqua Di Parma Barbiere', 4.8, 136, 239.00, 5, 'Gel de Barbear Acqua di Parma Barbiere Shaving Gel Masculino 150ml.', 'O Gel de Barbear refrescante Acqua di Parma se transforma em uma espuma rica quando massageado na pele. Formulado com uma mistura de óleos orgânicos vegetais, este Gel de Barbear hidrata e protege a pele contra irritações. Para quem prefere um ritual de barbear mais rápido. Formulado com extratos naturais de uva, erva-cidreira e hortelã, visando proteger, refrescar a pele e reduzir a irritação causada pela lâmina de barbear.', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/skin_care/espuma-acquadiparma.jpg');
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'Óleo Rejuvenescedor Abeille Royale', 4.9, 112, 270.00, 5, 'Óleo Rejuvenescedor Antirrugas Guerlain Abeille Royale 15ml.', 'Um óleo com base de água revolucionário que combina o poder de um sérum, a riqueza de um óleo e o frescor de uma loção. Após o uso, a pele aparece instantaneamente mais macia, preenchida e revitalizada. As micro gotas de óleo são liberadas no último minuto, deixando a pele radiante.', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/skin_care/rejuvenecedor-guerlain.jpg');
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'Sabonete Líquido Facial Clinique ', 4.6, 310, 119.00, 5, 'Sabonete Líquido Facial De Limpeza Suave Clinique 200ml.', 'Todos os benefícios do famoso sabonete facial desenvolvido pelos dermatologistas da Clinique, em sua nova fórmula líquida. O que faz? Limpa a pele sem ressecar. Prepara a pele para a ação esfoliante do produto Clarifying Lotion.', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/skin_care/sabonete-clinique.jpg');
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'Tônico Facial Biossance', 4.8, 163, 149.00, 5, 'Tônico Facial Minimizador de poros com Esqualano Biossance.', 'Tônico facial livre de álcool. Sua fórmula leve e refrescante, purifica, hidrata e minimiza os poros visivelmente. Purifica, clareia e visivelmente reduz os poros dilatados. Ajuda a remover as células mortas da superfície da pele. Desobstrui os poros, controla o excesso de oleosidade e esfolia suavemente para deixar a pele mais macia. Indicado para todos os tipos de pele, especialmente mista e oleosa.', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/skin_care/tonico-biossance.jpg');
    INSERT INTO product ( id, title, avaliacao, num_avaliacao, price, category_id, shortdescription, fulldescription, image) VALUES ( null, 'Vitamina C Biossance', 4.9, 96, 339.00, 5, 'Óleo Facial Biossance de Vitamina C com Rosas e Esqualano 30ml.', 'Óleo que tem o poder de iluminar, firmar, reduzir visivelmente a aparência de linhas, além de uniformizar a aparência e o toque da pele. Vegano, cruelty-free, livre de ingredientes nocivos para você e o meio ambiente. Melhora a elasticidade e a firmeza. Reduz a aparência das linhas de expressão e rugas. Uniformiza o tom e melhora a textura da pele. Protege contra a Luz Azul, impedindo o envelhecimento da pele.', 'https://amarecuidar.s3.sa-east-1.amazonaws.com/skin_care/vitamina-biossance.jpg');
    
    ```

